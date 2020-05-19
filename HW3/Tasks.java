package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Tasks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /*
        System.out.println("Enter numbers between -5 and 5: ");
        int wrongNumber = 0;
        for (int i = 0; i < 3; i++) {
            float num = Float.parseFloat(br.readLine());
            if (num < -5 || num > 5) {
                wrongNumber++;
            }
        }
        System.out.println("You input 3 numbers and " + wrongNumber + " doesn't match range");
        */

        System.out.println("Enter 3 int numbers: ");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int a = Integer.parseInt(br.readLine());
            nums[i] = a;

        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
            }
            if (min > nums[i]){
                min = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

    }
}
