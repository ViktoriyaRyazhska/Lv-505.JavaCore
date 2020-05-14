package Lesson4practice;

public class ProductApp {
    public static void main(String[] args) {
        Product p1 = new Product("Meat", 22, 2);
        Product p2 = new Product("Milk", 12, 3);
        Product p3 = new Product("Water", 7, 4);
        Product p4 = new Product("Juice", 4, 5);

        //Display the name and quantity of the most expensive item.

        if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
            System.out.println("Name of the most expensive  product is " + p1.getName() + "Quantity is " + p1.getQuantity());
        } else if (p2.getPrice() > p1.getPrice() && p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()) {
            System.out.println("Name of the most expensive product is " + p2.getName() + "Quantity is " + p2.getQuantity());
        } else if (p3.getPrice() > p1.getPrice() && p3.getPrice() > p2.getPrice() && p3.getPrice() > p4.getPrice()) {
            System.out.println("Name of the most expensive product is " + p3.getName() + "Quantity is " + p3.getQuantity());
        } else if (p4.getPrice() > p1.getPrice() && p4.getPrice() > p2.getPrice() && p4.getPrice() > p3.getPrice()) {
            System.out.println("Name of the most expensive product is " + p4.getName() + "Quantity is " + p4.getQuantity());
        }

        //Display the name of the items, which has the biggest quantity.
        if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity() && p1.getQuantity() > p4.getQuantity()) {
            System.out.println("Name of the item with the biggest quantity is " + p1.getName());
        } else if (p2.getQuantity() > p1.getQuantity() && p2.getQuantity() > p3.getQuantity() && p2.getQuantity() > p4.getQuantity()) {
            System.out.println("Name of the item with the biggest quantity is " + p2.getName());
        } else if (p3.getQuantity() > p1.getQuantity() && p3.getQuantity() > p2.getQuantity() && p3.getQuantity() > p4.getQuantity()) {
            System.out.println("Name of the item with the biggest quantity is " + p3.getName());
        } else if (p4.getQuantity() > p1.getQuantity() && p4.getQuantity() > p2.getQuantity() && p4.getQuantity() > p3.getQuantity()) {
            System.out.println("Name of the item with the biggest quantity is " + p4.getName());
        }

    }

}
