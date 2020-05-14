package Lesson4practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Namethecountry {

    public enum continent{Africa,America,Europe,Asia,};

    public static void main(String[] args)throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the country :");
        String country = br.readLine();

        switch(country){
            case "Ukraine":
            case "France":
                System.out.println(continent.Europe);
                break;
            case "Nigeria":
                System.out.println(continent.Africa);
                break;
            case "Argentine":
                System.out.println(continent.America);
                break;
            case "Japan":
                System.out.println(continent.Asia);
                break;

            default:
                System.out.println("Input is wrong");

        }

    }

}
