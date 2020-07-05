package Lesson10HomeWorkPracticeTask2;

public class Run2s implements Runnable {


    //Output two messages «Hello, world» and «Peace in the peace» 5 times each with the intervals of 2 seconds, and the second - 3 seconds.
    // After printing messages, print the text «My name is …»

  /*   @Override
   public void run() {
        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {

            try {

                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("  Peace in the peace");
        }

*/

   @Override
    public void run() {
        System.out.println("- Thread ID = " + Thread.currentThread().getId());

        for (int i = 0; i < 5; i++) {
            synchronized (TwoStreamsApp.monitor) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.print(" Peace in the peace");

            }

        }

    }

}
