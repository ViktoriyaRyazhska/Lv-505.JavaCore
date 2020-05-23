package homework6;

public abstract class NonFlyingBird extends Bird{

    @Override
    public void fly() {
        System.out.println("Unfortunately I can't fly.");
    }
}
