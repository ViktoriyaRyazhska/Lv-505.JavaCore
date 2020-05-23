package Lesson6HomeWork;

public abstract class Bird {

    Boolean feathers;
    Boolean layEggs;

    public Bird(Boolean feathers, Boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    public   abstract void fly();

}
