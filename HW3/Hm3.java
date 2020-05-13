package study.homework3;

public class Hm3 {
    public static void main(String[] args) {
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
        p4.input("Ivan","Krylko",(short) 1975);
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
