import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTest {
    public static void main(String[] args)throws IOException {
        int count =0;




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first number");
        int firstNumber = Integer.parseInt(br.readLine());

        if(firstNumber%2==0){
            count++;
        }
        System.out.println("Please enter your second number");
        int secondNumber= Integer.parseInt(br.readLine());

        if(secondNumber%2==0){
            count++;
        }
        System.out.println("Please enter your third number");
        int thirdNumber= Integer.parseInt(br.readLine());

        if(thirdNumber%2==0){
            count++;
        }

        System.out.println(count);




    }
}
