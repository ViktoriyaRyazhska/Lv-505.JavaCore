package lesson6;

public abstract class Person {

    private String name;
    private TypeOfPerson type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(TypeOfPerson type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public TypeOfPerson getType() {
        return type;
    }

    public abstract void print();
}
