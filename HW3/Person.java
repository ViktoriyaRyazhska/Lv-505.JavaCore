package study.homework3;

import java.time.*;

public class Person {
    private String firstName;
    private String lastName;
    private short birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {
        this.birthYear = birthYear;
    }

    public Person(){}

    public Person(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void getAge(){
        System.out.println("If you were born until " + MonthDay.now().getDayOfMonth()+" of "+
                            MonthDay.now().getMonth()+", you are "+ (Year.now().getValue()-this.birthYear));
    }

    public void input(String firstName, String lastName, short birthYear){
        this.firstName = firstName;
        this. lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output(){
        System.out.println("Hi, "+this.firstName+" "+this.lastName+", born in "+this.birthYear);
    }

    public void changeName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Congrats. Now you are "+this.firstName+" "+this.lastName);
    }
}
