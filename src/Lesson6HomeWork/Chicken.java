package Lesson6HomeWork;

public class Chicken extends NonFlyingBird {

Boolean hasManySmallChicken;

    public Chicken(Boolean feathers, Boolean layEggs, boolean canSwim, Boolean hasManySmallChicken) {
        super(feathers, layEggs, canSwim);
        this.hasManySmallChicken = hasManySmallChicken;
    }

 public void fly(){
     System.out.println("Chicken does not fly");
 }
    public void chickenFood(){
    System.out.println("Chicken like to eat worms ");
}

    public Boolean getHasManySmallChicken() {
        return hasManySmallChicken;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "hasManySmallChicken=" + hasManySmallChicken +
                ", canSwim=" + canSwim +
                ", feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
