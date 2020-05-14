import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson4 {
    private static int odd = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter numbers");
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a % 2 == 0){
                odd++;
            }
        }
        System.out.println(odd);

        System.out.println("Enter week day number(1-7): ");
        int weekDay = Integer.parseInt(br.readLine());
        switch (weekDay) {
            case 1:
                System.out.print("Ponedilok, Monday, Ponedelnik");
                break;
            case 2:
                System.out.println("Vivtorok, Tuesday, Vtornik");
                break;
            case 3:
                System.out.println("Sereda, Wednesday, Sreda");
                break;
            case 4:
                System.out.print("Chetver, Thursday, Chetverg");
                break;
            case 5:
                System.out.print("P`yatnica, Friday, Pyatnica");
                break;
            case 6:
                System.out.print("Subbota, Saturday, Sybbota");
                break;
            case 7:
                System.out.print("Nedilya, Sunday, Voskresenie");
                break;
            default:
                System.out.print("Enter numbers between 1 and 7");
        }


    }
}
