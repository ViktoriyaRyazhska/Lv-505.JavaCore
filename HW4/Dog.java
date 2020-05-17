package HW4;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public String getName (){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +
                " is a " + breed +
                ", age = " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Dog older(Dog dog){
        if (this.age>dog.age) {
            return this;
        }
        return dog;
    }
}
