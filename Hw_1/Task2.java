package MyFirstHomework;
import java.util.Scanner;

public class MyFirstHometask {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What's your name?");
      String name = scan.nextLine();
    System.out.println("Where do you live?");
      String adress = scan.nextLine();
    System.out.println("Name and adress: " + name + ", " + adress);
  }

}
