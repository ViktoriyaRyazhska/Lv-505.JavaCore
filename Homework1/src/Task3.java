import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter price for call per 1 minute for France :");
		 float c1 = Float.parseFloat(br.readLine());
		 System.out.println("Enter price for call per 1 minute for USA :");
		 float c2 = Float.parseFloat(br.readLine());
		 System.out.println("Enter price for call per 1 minute for Germany :");
		 float c3 = Float.parseFloat(br.readLine());
		 
		 System.out.println("How much minutes do you need for France?");
		 float t1 = Float.parseFloat(br.readLine());
		 System.out.println("How much minutes do you need for USA?");
		 float t2 = Float.parseFloat(br.readLine());
		 System.out.println("How much minutes do you need for Germany?");
		 float t3 = Float.parseFloat(br.readLine());

		 double France = c1 * t1; 
		 double USA = c2 * t2; 
		 double Germany = c3 * t3; 
		 
		 double Sum = France + USA + Germany;
		 
		 System.out.println("Price for call with France = " +France );
		 System.out.println("Price for call with USA = " +USA );
		 System.out.println("Price for call with Germany = " +Germany );
		 System.out.println("Price for all calls together = " +Sum );
	}

}
