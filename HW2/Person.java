import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private static int count = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Person (){
        count++;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
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

    public int getAge(){
        int year = Calendar.getInstance().getWeekYear();
        return year - this.birthYear;
    }

    //Enter personal data
    public void input() throws IOException {

        System.out.println("Enter person first name: ");
        this.firstName = br.readLine();
        System.out.println("Enter person last name: ");
        this.lastName = br.readLine();
        System.out.println("Enter person year of birth: ");
        this.birthYear = Integer.parseInt(br.readLine());
       }

       //Output information about a person
       public void output(){
           System.out.println("This is " + this.firstName + " " + this.lastName + ". Age is: " + this.getAge());
       }

       //Changing names
        public void changeName(String... strings) throws IOException {
            System.out.println("Please tell us what do you want to change?");
            String change = br.readLine();
            if (change.equals("firstName")){
                System.out.println("Enter new firstName: ");
                firstName = br.readLine();
            }   else if (change.equals("lastName")){
                System.out.println("Enter new lastName: ");
                lastName = br.readLine();
            }   else if (change.equals("both")) {
                System.out.println("Enter new firstName: ");
                firstName = br.readLine();
                System.out.println("Enter new lastName: ");
                lastName = br.readLine();
            } else System.out.println("Sorry stupid robot doesn't understand what do you want to change");
        }

    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.input();
        person.output();
        person.changeName();
        person.output();

    }
}
