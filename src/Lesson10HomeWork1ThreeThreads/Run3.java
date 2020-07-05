package Lesson10HomeWork1ThreeThreads;

public class Run3 implements Runnable {
private Thread [] threadsnew;

    public Run3(Thread... threads) {

        threadsnew=threads;
    }


    @Override

    public void run() {

        for (int i=0;i<threadsnew.length;i++){
            try {
                threadsnew[i].join();
            }
            catch (Exception e){}
        }

        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {
            synchronized (ThreeThreads.monitor1) {

                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.print(" Hello  Thread3");

            }
        }

    }
}
