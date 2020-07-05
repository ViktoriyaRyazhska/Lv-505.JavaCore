package Lesson11Examples;


import java.util.Comparator;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}


public class ApplOper {

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);


    }

    public static void main(String[] args) {
        //Comparator c;
        ApplOper tester = new ApplOper();
        // with type declaration
        MathOperation addition = (a, b) -> a + b;
        // with out type declaration
        MathOperation subtraction = (a, b) -> a - b;
        // with return statement along with curly braces
        MathOperation multiplication = (a, b) -> {
            return a * b;
        };
        // without return statement and without curly braces
        MathOperation division = (a, b) -> a / b;
        //
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
    }
}