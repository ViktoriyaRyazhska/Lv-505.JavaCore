import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAddress {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What is your name???");
		String answer1 = br.readLine();
		System.out.println("Where do you live???"); 
		String answer2 = br.readLine();

		System.out.println("Name: " + answer1);
		System.out.println("Address: " + answer2);