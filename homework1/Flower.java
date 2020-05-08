import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please input Flower radius");
		int radius = Integer.parseInt(br.readLine());

		double area = Math.PI * (radius * radius);
		System.out.println("Area of the flower is equal to: " + area);

		double circumference = Math.PI * 2 * radius;
		System.out.println("Perimeter of the flower is equal to : " + circumference);
	}
}