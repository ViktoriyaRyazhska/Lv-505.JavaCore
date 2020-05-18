package Lesson4Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){}//порожній конструктор щоб можна було пізніше зчитати у нього

    public int  getAge(){
        return LocalDate.now().getYear() - this.birthYear;//Створив поле сurrent year і відняв від нього дату народження обєкту

    }

    public void output(Person person){
        System.out.println("Output information about person is : " +person.toString() +person.getAge());//На вхід у метод поставив обєкт Person а у методі викликав йогго toString та getAge
    }

    public void output2(){
        System.out.println("name is " + this.firstName + "lastname is " + this.lastName + "age is " + this.getAge());//можна викликати характеристики обєкту  через this
    }


    public void input(BufferedReader br) throws IOException{
//зчитав через Bufferedreader дані у пороржній конструктор обєкту
        // передаю через зчитування полям обєкту властивості
        //дані можна через конструктор вказувати або через консоль

        System.out.println("Please enter first name ");
        this.firstName = br.readLine();
        System.out.println("Please enter second name");
        this.lastName =br.readLine();
        System.out.println("Please enter your age");
        this.birthYear = Integer.parseInt(br.readLine());

    }

    public void changeName(String ...strings) throws IOException{//на вхід у метод може прийти кілька string параметрів(тобто у change)
        // varArgs добре тому ще при виклику мктоду не треба вказувати на вхід що прийшло,тобто зчитати можна обидва бо по одному string параметри
        //можу з 2ма параметрами string firstname s lastname працювати

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please update data for the object :");
        String change =br1.readLine();// у змінну типу String  записується те що вводимо у консолі
        switch (change) {
            case "firstName":
                System.out.println("Please enter new first name: ");
                firstName = br1.readLine();
                break;
            case "lastName":
                System.out.println("Please enter new last name: ");
                lastName = br1.readLine();
                break;
            case "Both":
                System.out.println("Please enter new first name and new last name:");//якщо ввели both то в консоль вводимо і нове імя  і прізвище
                firstName = br1.readLine();
                lastName = br1.readLine();
                break;
            default:
                System.out.println("Please choose correct option");
                break;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
