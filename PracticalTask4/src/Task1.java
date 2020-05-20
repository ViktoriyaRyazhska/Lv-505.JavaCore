import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter three numbers:");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		if (a % 2 != 0) {
			count++;
		}

		if (b % 2 != 0) {
			count++;
		}

		if (c % 2 != 0) {
			count++;
		}

		System.out.println("Amount of odd numbers: " + count);

	}

}
