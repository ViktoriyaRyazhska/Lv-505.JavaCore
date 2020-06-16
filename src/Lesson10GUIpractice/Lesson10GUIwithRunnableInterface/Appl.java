package Lesson10GUIpractice.Lesson10GUIwithRunnableInterface;

public class Appl {

    public static void main(String[] args) {
        DialogTime dt = new DialogTime();
        dt.setVisible(true);
        System.out.println("Appl: Thread ID = " + Thread.currentThread().getId());
    }


}
