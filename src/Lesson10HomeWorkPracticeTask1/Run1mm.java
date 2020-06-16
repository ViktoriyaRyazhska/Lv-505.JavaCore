package Lesson10HomeWorkPracticeTask1;

public class Run1mm implements Runnable {

    @Override
    public void run() {
        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 10; i++) {

            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("I study Java");

        }

    }
}