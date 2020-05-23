package homework6;

public class Swallow extends FlyingBird{

    public Swallow(int year, String feathers, int layEggs, int distance) {
        this.setType(TypeBird.SWALLOW);
        this.setYear(year);
        this.setFeathers(feathers);
        this.setLayEggs(layEggs);
        this.setDistance(distance);
    }

    @Override
    public void output(){
        super.output();
        System.out.println("I am a herbivorous bird.");
    }
}
