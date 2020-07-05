package Lesson10HomeWork1ThreeThreads;

public class ThreeThreads {
    public static Object monitor1 = new Object();


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
//Run three threads and output there different messages for 5 times.
// The third thread supposed to start after finishing working of the two previous threads.



        // Thread.yield();
        Runnable r1 = new Run1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Run2();
        Thread t2 = new Thread(r2);

        Runnable r3 = new Run3(t1,t2);
        Thread t3 = new Thread(r3);


        t1.start();
       // t1.join();

        t2.start();
       // t2.join();

        t3.start();
       // t3.join();



/*
        for(int i = 0; i < 3; i++) {
           Thread thread = new Thread();
            thread.start();

            thread.join();    // Wait for it to finish.
        }

*/


        System.out.println(" My name is Volodymyr");

        System.out.println(" Main DONE" );



    }


}
