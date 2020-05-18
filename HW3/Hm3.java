package study.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hm3 {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        p1.setFirstName("Oleg");
        p1.setLastName("Glebov");
        p1.setBirthYear((short)1997);
        p1.output();
        Person p2 = new Person("Igor","Pylypenko");
        p2.setBirthYear((short)2000);
        p2.output();
        Person p3 = new Person("Viktor","Sorokin");
        p3.setBirthYear((short)1989);
        p3.output();
        Person p4 = new Person();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your first name:");
        String testName = br.readLine();
        System.out.println("Enter your last name: ");
        String testLastName = br.readLine();
        System.out.println("Enter your age: ");
        short testAge = (short)Integer.parseInt(br.readLine());
        p4.input(testName,testLastName,testAge);
        p4.output();
        Person p5 = new Person("Stepan","Velychko");
        p5.output();
        System.out.println("Oops");
        p5.setBirthYear((short)1979);
        p5.output();
        System.out.println("--------------------------------------------");
        System.out.println(p3.getFirstName()+" "+p3.getLastName()+":");
        p3.getAge();
        System.out.println(p5.getFirstName()+" "+p5.getLastName()+":");
        p5.changeName("Stepan","Bandera");




    }
}
