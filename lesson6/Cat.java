package lesson6;

public class Cat implements Animal {

    private String name;

    public String getName() {
        return this.name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println(this.name + " say meow.");
    }

    @Override
    public void feed() {
        System.out.println(this.name + " loves to eat fish and drink milk.");
    }
}
