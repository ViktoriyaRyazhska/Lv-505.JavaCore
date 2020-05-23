package homework6;

public abstract class FlyingBird extends Bird {

    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void fly() {
        System.out.println("Hooray. I can fly " + this.distance + " km continuously.");
    }

}
