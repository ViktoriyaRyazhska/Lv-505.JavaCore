package HW5.Task1;

public class Chicken extends NonFlyingBird {
    @Override
    public void fly() {
        System.out.println("Chicken can't fly!");
    }
}
