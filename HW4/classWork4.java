package HW4;

public class classWork4 {
    public static void main(String[] args) {
        int[] array =  {3, 45, 20, 14, -4, 66, -35, -203, 43, -23};
        int max = array[0];
        int sumPositive = 0;
        int amountNegative = 0;
        int amountPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] >= 0){
                sumPositive = sumPositive + array[i];
                amountPositive++;
            } else {
                amountNegative++;
            }

        }
        System.out.println("The biggest number is: " + max);
        System.out.println("Sum of positive number: " + sumPositive);
        System.out.println("Amount of negative numbers: " + amountNegative);

        if (amountNegative > amountPositive) {
            System.out.println("There are more negative numbers.");
        } else {
            System.out.println("There are more positive numbers.");
        }
    }
}
