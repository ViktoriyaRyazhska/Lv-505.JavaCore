package lesson6;

public class Dog implements Animal{

    private String name;

    public String getName(){
        return this.name;
    }

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(this.name+" say woof.");
    }

    @Override
    public void feed() {
        System.out.println(this.name + " loves to eat meat.");
    }
}
