package Lesson6HomeWork;

public class BirdAppMain {
    public static void main(String[] args) {

        Bird b1 = new FlyingBird(true, true, true);
        Bird b2 = new NonFlyingBird(false, false, false);
        Bird b4 = new Eagle(true, true, false, 20, 5);
        Bird b5 = new Swallow(true, true, false, 8, 7);
        NonFlyingBird b6 = new Penguin(false, true, true, true);
        NonFlyingBird b7 = new Chicken(true, true, false, true);

        System.out.println("Methods of Birds:");

        b1.fly();
        b2.fly();
        System.out.println();

        System.out.println("Methods of Flying Birds:");
        b4.fly();
        b5.fly();
        ((Eagle) b4).catchSnakes();
        ((Swallow) b5).swallowAppearance();

        System.out.println();
        System.out.println("Methods of NonFlying Birds:");
        b6.fly();
        b7.fly();
        ((Penguin) b6).catchFish();
        b7.fly();
        ((Chicken) b7).chickenFood();
        System.out.println();
        System.out.println("Birds description:");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());
        System.out.println(b6.toString());
        System.out.println(b7.toString());

        //Create array Bird and add different birds to it;
        //Call fly() method for all of it. Output the
        //information about each type of created bird.

        Bird[] arrayOfBirds = {new Eagle(true, true, false, 20, 5),
                new Swallow(true, true, false, 8, 7),
                new Penguin(false, true, true, true),
                new Chicken(true, true, false, true)};

        for (Bird current : arrayOfBirds) {
            current.fly();
            System.out.println(current.toString());

        }

    }
}
