import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class flowerBed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Flower bed radius = ");
        int r = Integer.parseInt(br.readLine());
        double perimeter = 2 * r * Math.PI;
        double area = r * r * Math.PI;
        System.out.println("Flower bed perimeter = " + perimeter);
        System.out.println("Flower bed area = " + area);
    }
}
