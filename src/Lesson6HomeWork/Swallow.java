package Lesson6HomeWork;

public class Swallow extends FlyingBird{

    int age;
    int weight;

    public Swallow(Boolean feathers, Boolean layEggs, boolean canSwim, int age, int weight) {
        super(feathers, layEggs, canSwim);
        this.age = age;
        this.weight = weight;
    }

    public void fly(){
        System.out.println("Swallow starts flying");
    }

public void swallowAppearance(){
    System.out.println("Swallow is the most beautiful Flying bird");
        }

    @Override
    public String toString() {
        return "Swallow{" +
                "age=" + age +
                ", weight=" + weight +
                ", canSwim=" + canSwim +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
