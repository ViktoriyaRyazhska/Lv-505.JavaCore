package Lesson4Homework;

public class Dog {

    public enum breed {AustralianShepherd, AustralianTerrier, AmericanBulldog} // enum must be public

    String name;
    int age;

    private breed aBreed; // we need to create field  of type gender(of our enum)

    public Dog(String name, int age,breed aBreed) { //in constructor we shall add reference to an object of type gender
        this.name = name;
        this.age = age;
        this.aBreed  = aBreed;// we need to assign parameter to this field

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
