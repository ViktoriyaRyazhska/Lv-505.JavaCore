package Lesson6HomeWork;

public class FlyingBird extends Bird{

    //added additional field swim
boolean canSwim;

    public FlyingBird(Boolean feathers, Boolean layEggs, boolean canSwim) {
        super(feathers, layEggs);
        this.canSwim = canSwim;
    }

    //Abstract Method Fly()
    @Override
    public void fly() {

        System.out.println("Flying birds are the Best!!!");

    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "canSwim=" + canSwim +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
