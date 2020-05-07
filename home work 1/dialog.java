package les1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dialog {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("Привіт, як тебе звати?");
		String name = br.readLine();
		System.out.println("на якій вулиці ти живеш?");
		String live = br.readLine();
		System.out.println("який номер будинку?");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Здорова " + name); 
		System.out.println("ти живеш на " + live);
		System.out.println("в будинку №" + age);

		}
}