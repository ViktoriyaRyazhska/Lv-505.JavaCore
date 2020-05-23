package homework6;

public class Penguin extends NonFlyingBird{

    public Penguin(int year, String feathers, int layEggs) {
        this.setType(TypeBird.PENGUIN);
        this.setYear(year);
        this.setFeathers(feathers);
        this.setLayEggs(layEggs);
    }

    @Override
    public void output(){
        super.output();
        System.out.println("I love to eat small fish.");
    }
}
