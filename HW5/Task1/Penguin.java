package HW5.Task1;

public class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        System.out.println("Penguin can't fly!");
    }
}
