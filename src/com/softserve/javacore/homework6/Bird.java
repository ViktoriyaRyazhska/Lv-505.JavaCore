package com.softserve.javacore.homework6;

import java.util.Arrays;

abstract class Bird {
    public String feathers;
    public boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    public abstract void fly();


    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("dark grey", true);
        birds[1] = new Swallow("blue-white", true);
        birds[2] = new Penguin("black-white", true, "Emperor");
        birds[3] = new Chicken("brown", true);

        birds[0].fly();
        birds[1].fly();
        birds[2].fly();
        birds[3].fly();

        System.out.println(Arrays.toString(birds));
    }
}

class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}


class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can not fly :( !");
    }
}

class Eagle extends FlyingBird {

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}

class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}

class Penguin extends NonFlyingBird {

    String type;

    public Penguin(String feathers, boolean layEggs, String type) {
        super(feathers, layEggs);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                ", type='" + type + '\'' +
                '}';
    }
}

class Chicken extends NonFlyingBird {

    public Chicken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}