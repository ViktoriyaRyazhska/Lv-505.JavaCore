package Lesson6HomeWork;

public class NonFlyingBird extends Bird {

//added additional field swim
    boolean canSwim;

    public NonFlyingBird(Boolean feathers, Boolean layEggs, boolean canSwim) {
        super(feathers, layEggs);
        this.canSwim = canSwim;
    }

    //Abstract Method Fly()

    @Override
    public void fly() {
        System.out.println("NonFlying birds are the Best!!!");
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "NonFlyingBird{" +
                "canSwim=" + canSwim +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
