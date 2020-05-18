package Lesson4Homework;

public class Dog {

    public enum breed {AustralianShepherd, AustralianTerrier, AmericanBulldog} // enum must be public

    String name;
    int age;

    private breed aBreed; // we need to create field  of type gender(of our enum)

    public Dog(String name, int age, breed aBreed) { //in constructor we shall add reference to an object of type gender
        this.name = name;
        this.age = age;
        this.aBreed = aBreed;// we need to assign parameter to this field

    }

    public  Dog CheckOldestDog(Dog dog) { //поле типу Dog,на вхід приходить якийсь dog
        if (this.age > dog.age) {          //якщо вік dogа на  якому я викликаю метод більший віку dogа який приходить на вхід то
            // визнач doga на якому я викликаю метод  старшим
            return this;
        }
        return dog;                    // else визнач doga який приходить на вхід старшим
    }


    public Dog CheckTheSameNames(Dog dog) {
        if (this.name.equals(dog.name)) {
            System.out.println("These dogs are with the same name");

            return this;
        }
        System.out.println("These dogs have different names ");
        return dog;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aBreed=" + aBreed +
                '}';
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
