package HW5.Task1;

public class NonFlyingBird extends Bird{
    @Override
    public void fly() {
        System.out.println("Non flying bird can't fly!");
    }
}
