package Lesson7Homework;
import java.util.*;

public class PracticalTask1 {

    public static void main(String[] args) {
        //Declare collection myCollection of 10 integers and fill it (from the console )
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myCollection = new ArrayList<>(10);
        System.out.println("Please enter your numbers: ");

        while (sc.hasNextInt()) {
            myCollection.add(sc.nextInt());
        }
        System.out.println("My first list is " + myCollection);

        //Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection

        ArrayList<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("New collection with elements more than 5 is " + newCollection);

        // Remove from collection myCollection elements, which are greater then 20. Print result
        Iterator<Integer> i = myCollection.iterator();
        while (i.hasNext()) {
            int number = i.next();
            if (number > 20) {
                i.remove();
            }
        }
        System.out.println("Collection after removal elements which are greater than 20 is " + myCollection);

        //Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Integer> myCollection2 = new ArrayList<>(10);
        System.out.println("Please enter your numbers: ");

        while (sc2.hasNextInt()) {
            myCollection2.add(sc2.nextInt());
        }

        System.out.println("Collection after insertion of new elements is: ");
        for (int c = 0; c < myCollection2.size(); c++) {

            if (c == 2) {
                myCollection2.add(2, 1);
            }
            if (c == 8) {
                myCollection2.add(8, -3);
            }
            if (c == 5) {
                myCollection2.add(5, -4);
            }
        }
        System.out.println(myCollection2);
        System.out.println("Collection in the format: position – xxx, value of element – xxx :");
        for (int c = 0; c < myCollection2.size(); c++) {

            System.out.println("Position " + c + " Value of element " + myCollection2.get(c));
        }
//Sort and print collection
        Collections.sort(myCollection2);
        System.out.println("Sorted collection is " + myCollection2);
    }
}




