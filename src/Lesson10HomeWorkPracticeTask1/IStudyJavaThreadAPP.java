package Lesson10HomeWorkPracticeTask1;

public class IStudyJavaThreadAPP {


    //Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        Runnable r1 = new Run1mm();
        Thread t1 = new Thread(r1);

        t1.start();

       // t1.join();

        System.out.println(" Main DONE" );

    }
}
