package lesson6;

public class Teacher extends Staff {

    private final int COEF = 100;

    public Teacher(String name, int exp) {
        this.setName(name);
        this.exp = exp;
        this.setType(TypeOfPerson.TEACHER);
    }

    @Override
    public int salary() {
        if (this.exp <= 10) {
            System.out.println("My salary is " + (this.exp * COEF) + " y.o.");
            return this.exp * COEF;
        }
        System.out.println("My salary is " + ((this.exp - 10) * COEF / 2 + 1000) + " y.o.");
        return (this.exp - 10) * COEF / 2 + 1000;
    }

    @Override
    public void print() {
        System.out.println("Hi, I'm " + this.getName() + ".\n" +
                "I have been working " + this.getType().getType() + " for " + this.exp + " years.");
    }
}
