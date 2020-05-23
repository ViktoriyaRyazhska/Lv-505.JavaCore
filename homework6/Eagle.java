package homework6;

public class Eagle extends FlyingBird{

    public Eagle(int year, String feathers, int layEggs, int distance) {
        this.setType(TypeBird.EAGLE);
        this.setYear(year);
        this.setFeathers(feathers);
        this.setLayEggs(layEggs);
        this.setDistance(distance);
    }

    @Override
    public void output(){
        super.output();
        System.out.println("I am a bird of prey.");
    }
}