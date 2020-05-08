import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Сonverstation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please input country Sum Time for the first country ");
		int countrySum_1 = Integer.parseInt(br.readLine());
		System.out.println("Please input converstation Time for the first country ");
		int converstationTime_1 = Integer.parseInt(br.readLine());
		System.out.println("sum per call first country = " + countrySum_1 * converstationTime_1);

		System.out.println("Please input country Sum Time for the second country ");
		int countrySum_2 = Integer.parseInt(br.readLine());
		System.out.println("Please input converstation Time for the second country ");
		int converstationTime_2 = Integer.parseInt(br.readLine());
		System.out.println("sum per call country  = " + countrySum_2 * converstationTime_2);

		System.out.println("Please input country Sum Time for the third country ");
		int countrySum_3 = Integer.parseInt(br.readLine());
		System.out.println("Please input converstation Time for the third country ");
		int converstationTime_3 = Integer.parseInt(br.readLine());
		System.out.println("sum per call first country = " + countrySum_3 * converstationTime_3);

		int allSum = + (countrySum_1 * converstationTime_1)
				+ (countrySum_2 * converstationTime_2) + (countrySum_1 * converstationTime_1);
		System.out.println("All sum for the converstations is = " + allSum );

	}

}
