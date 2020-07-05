package Lesson10HomeWork3StartOneThreadInAnotherThread;

public class Run1new implements Runnable{

    @Override
    public void run() {

        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        Runnable r2 = new Run2new();
        Thread t2 = new Thread(r2);
        t2.start();

        for (int i = 0; i < 5; i++) {
            synchronized (StartThreadInAnotherThreadApp.monitor2) {

                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Приспав потік і передав виконання наступному в черзі з MAIN METHOD(Порядок визначений там)

                Thread.onSpinWait();

                //Thread.yield();
                //



            }
        }
    }




}
