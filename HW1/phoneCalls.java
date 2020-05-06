import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class phoneCalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Data input
        System.out.println("Enter c1 rate per minute: ");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("Enter c2 rate per minute: ");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("Enter c3 rate per minute: ");
        int c3 = Integer.parseInt(br.readLine());

        System.out.println("How long was the call to country1(in minutes): ");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("How long was the call to country2(in minutes): ");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("How long was the call to country3(in minutes): ");
        int t3 = Integer.parseInt(br.readLine());

        //Calculations and output
        System.out.println("Call to country1 costs: " + c1 * t1);
        System.out.println("Call to country2 costs: " + c2 * t2);
        System.out.println("Call to country3 costs: " + c3 * t3);
        System.out.println("Calls to all countries costs: " + (c1 * t1 + c2 * t2 + c3 * t3));
        System.out.println("Have a good day!");

    }
}

