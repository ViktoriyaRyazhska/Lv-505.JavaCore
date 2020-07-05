package Lesson10HomeWork3StartOneThreadInAnotherThread;

public class StartThreadInAnotherThreadApp {

    public static Object monitor2 = new Object();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        //Create a thread «one», which would start the
        // thread «two», which has to output its number («Thread number two») 3 times
        // and create thread «three», which would to output message «Thread number three» 5 times.

        Runnable r1 = new Run1new();
        Thread t1 = new Thread(r1);

      //  Runnable r2 = new Run2new();
       // Thread t2 = new Thread(r2);

        Runnable r3 = new Run3new();
        Thread t3 = new Thread(r3);


        t1.start();
        t1.join();

        //t2.start();
        //t2.join();

        t3.start();
        t3.join();





        System.out.println(" My name is Volodymyr ");

        System.out.println(" Main DONE" );


    }



}
