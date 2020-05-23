package lesson6;

public class Student extends Person {

    private int yearOfStudy;

    public Student(String name, int year) {
        this.setName(name);
        this.yearOfStudy = year;
        this.setType(TypeOfPerson.STUDENT);
    }

    @Override
    public void print() {
        System.out.println("Hi, I'm " + this.getName() + ". I am a " + this.yearOfStudy + " year " + this.getType().getType());
    }
}
