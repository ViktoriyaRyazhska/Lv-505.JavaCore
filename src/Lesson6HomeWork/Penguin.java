package Lesson6HomeWork;

public class Penguin extends NonFlyingBird {

    Boolean isRunning;

    public Penguin(Boolean feathers, Boolean layEggs, boolean canSwim, Boolean isRunning) {
        super(feathers, layEggs, canSwim);
        this.isRunning = isRunning;
    }

public void fly(){
    System.out.println("Penguin does not fly");
}
    public void catchFish(){
        System.out.println("Penguins are carnivores: they feed on fish, squid, crabs, krill and other seafood they catch while swimming");
    }

    public Boolean getRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "isRunning=" + isRunning +
                ", canSwim=" + canSwim +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
