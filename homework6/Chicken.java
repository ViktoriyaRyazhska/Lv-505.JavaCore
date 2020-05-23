package study.homework6;

public class Chicken extends NonFlyingBird{

    public Chicken(int year, String feathers, int layEggs) {
        this.setType(TypeBird.CHICKEN);
        this.setYear(year);
        this.setFeathers(feathers);
        this.setLayEggs(layEggs);
    }

    @Override
    public void output(){
        super.output();
        System.out.println("I love to eat grain and worms.");
    }
}
