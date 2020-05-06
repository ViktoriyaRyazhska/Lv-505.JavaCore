package MyFirstHomework;
import java.util.Scanner;

public class MyFirstHometask {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Price and time(Poland): ");
    int c1 = scan.nextInt();
    int t1 = scan.nextInt();
    System.out.println("Price and time(Spain): ");
    int c2 = scan.nextInt();
    int t2 = scan.nextInt();
    System.out.println("Price and time(USA): ");
    int c3 = scan.nextInt();
    int t3 = scan.nextInt();
    System.out.println("Pricelist Poland: " + c1*t1);
    System.out.println("Pricelist Spain: " + c2*t2);
    System.out.println("Pricelist USA: " + c3*t3);
    System.out.println("Full pricelist: " + (c1*t1+c2*t2+c3*t3));
  }

}
