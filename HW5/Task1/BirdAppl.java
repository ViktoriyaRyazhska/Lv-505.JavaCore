package HW5.Task1;

public class BirdAppl {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle(),
        new Swallow(),
        new Penguin(),
        new Chicken(),
        new FlyingBird(),
        new NonFlyingBird()};

        for(Bird current : birds){
            current.fly();
        }

    }
}
