package lesson6;

public class Cleaner extends Staff{

    public Cleaner (String name, int exp){
        this.setName(name);
        this.exp = exp;
        this.setType(TypeOfPerson.CLEANER);
    }


    @Override
    public int salary() {
        switch (this.exp){
            case 1: case 2: case 3:
                System.out.println("My salary is 100 y.o.");
                return 100;
            case 4: case 5: case 6: case 7:
                System.out.println("My salary is 250 y.o.");
                return 250;
            default:
                System.out.println("My salary is 400 y.o.");
                return 400;
        }
    }

    @Override
    public void print() {
        System.out.println("Hi, I'm " + this.getName() + ".\n" +
                "I have been working " + this.getType().getType() + " for " + this.exp + " years.");
        if (this.exp>15){
            System.out.println("I'm tired.");
        }
    }
}
