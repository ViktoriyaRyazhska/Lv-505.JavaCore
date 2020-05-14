public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {

        Product lardge = new Product("salo", 105, 10);
        Product meat = new Product("myaso", 140, 15);
        Product bones = new Product("kost", 105, 10);
        Product brain = new Product("mozg", 100500, 1);

        if (lardge.price > meat.price && lardge.price > bones.price && lardge.price > brain.price){
            System.out.println(lardge.name + " " + lardge.quantity);
        } else if (meat.price > lardge.price && meat.price > bones.price && meat.price > brain.price){
            System.out.println(meat.name + " " + meat.quantity);
        } else if (bones.price > lardge.price && bones.price > meat.price && bones.price  > brain.price){
            System.out.println(bones.name + " " + bones.quantity);
        } else {
            System.out.println(brain.name + " " + brain.quantity);
        }

        if (lardge.quantity > meat.quantity && lardge.quantity > bones.quantity && lardge.quantity > brain.quantity){
            System.out.println("The biggest quantity: " + lardge.name);
        } else if (meat.quantity > lardge.quantity && meat.quantity > bones.quantity && meat.quantity > brain.quantity){
            System.out.println("The biggest quantity: " + meat.name);
        } else if (bones.quantity > lardge.quantity && bones.quantity > meat.quantity && bones.quantity  > brain.quantity){
            System.out.println("The biggest quantity: " + bones.name);
        } else {
            System.out.println("The biggest quantity: " + brain.name);
        }

    }
}
