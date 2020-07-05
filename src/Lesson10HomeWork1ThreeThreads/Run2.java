package Lesson10HomeWork1ThreeThreads;

public class Run2 implements Runnable {

    @Override
    public void run() {
        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {
            synchronized (ThreeThreads.monitor1) {

                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.print(" Hello Thread2");

            }
        }
    }
}
