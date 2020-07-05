package Lesson10HomeWork3StartOneThreadInAnotherThread;

public class Run3new implements Runnable{


    @Override
    public void run() {

        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {
            synchronized (StartThreadInAnotherThreadApp.monitor2) {

                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.print(" Thread number three");

            }
        }
    }



}
