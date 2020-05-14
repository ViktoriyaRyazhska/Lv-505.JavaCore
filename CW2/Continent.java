import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continent {
    public enum continent {
        Africa, Antarctida, Australia, Eurasia, North_America, South_America
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter country: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName = br.readLine();

        switch (countryName){
            case "GB":
            case "Ukraine":
                System.out.println(continent.Eurasia);
                break;
            case "UAR":
            case "Egypt":
                System.out.println(continent.Africa);
                break;
            default:
                System.out.println("Country not in the list!");
        }
    }
}
