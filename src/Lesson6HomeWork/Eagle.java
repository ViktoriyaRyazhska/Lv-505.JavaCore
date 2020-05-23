package Lesson6HomeWork;

public class Eagle extends FlyingBird {

int weight;
int age;

    public Eagle(Boolean feathers, Boolean layEggs, boolean canSwim, int weight, int age) {
        super(feathers, layEggs, canSwim);
        this.weight = weight;
        this.age = age;
    }

    public void catchSnakes(){
        System.out.println("Eagle caught a snake!");
    }

    public void fly(){
        System.out.println("Eagle starts flying");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "weight=" + weight +
                ", age=" + age +
                ", canSwim=" + canSwim +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}
