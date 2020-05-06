
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hm1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Task 1.");
        System.out.print("Enter the radius: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double radius = Double.parseDouble(br.readLine());
        double perimeter = Math.PI*2*radius;
        double area = Math.pow(radius,2)*Math.PI;

        System.out.printf("Perimeter of flower bed is: "+"%.2f",perimeter );
        System.out.printf("\nArea is: "+"%.2f",area);
        //-----------------------------------------------------------------------
        System.out.println("\n\nTask 2.");
        System.out.println("What is your name? ");
        String name = br.readLine();
        System.out.println("Where you live, "+name+"?");
        String address = br.readLine();
        System.out.println("Hi, "+name+" from "+address);
        //-----------------------------------------------------------------------
        System.out.println("\nTask 3.");
        System.out.println("Enter three standard units:");
        int stOne = Integer.parseInt(br.readLine());
        int stTwo = Integer.parseInt(br.readLine());
        int stThree = Integer.parseInt(br.readLine());
        System.out.println("Enter duration of three calls:");
        int callOne = Integer.parseInt(br.readLine());
        int callTwo = Integer.parseInt(br.readLine());
        int callThree = Integer.parseInt(br.readLine());
        System.out.println("First call cost - "+(stOne*callOne)+" dollars;");
        System.out.println("Second call cost - "+(stTwo*callTwo)+" dollars;");
        System.out.println("Third call cost - "+(stThree*callThree)+" dollars;");
        System.out.println("All calls costs "+(stOne*callOne+stTwo*callTwo+stThree*callThree)+" dollars together.");
    }
}
