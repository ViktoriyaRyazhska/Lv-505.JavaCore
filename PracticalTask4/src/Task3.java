import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String country = br.readLine();

		switch (country.toLowerCase()) {
		case "nigeria":
		case "egypt":
		case "kenya":
			System.out.println("Continent of the country:" + Continent.Africa);
			break;
		case "new zealand":
		case "norway":
			System.out.println("Continent of the country:" + Continent.Antarctica);
			break;
		case "russia":
		case "china":
			System.out.println("Continent of the country:" + Continent.Asia);
			break;
		case "ukraine":
		case "france":
		case "germany":
			System.out.println("Continent:" + Continent.Europe);
			break;
		case "usa":
		case "canada":
			System.out.println("Continent:" + Continent.NorthAmerica);
			break;
		case "nauru":
		case "samoa":
			System.out.println("Continent:" + Continent.Australia);
			break;
		case "brazil":
		case "colombia":
			System.out.println("Continent:" + Continent.SouthAmerica);
			break;
		default:
			System.out.println("Wrong!");
		}
	}

}
