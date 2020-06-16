package Lesson10HomeWorkPracticeTask2;

public class TwoStreamsApp {

    public static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        Runnable r1 = new Run1s();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Run2s();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        Thread.yield();

        t1.join();
        t2.join();


        System.out.println(" My name is Volodymyr");

        System.out.println(" Main DONE" );

    }
}
