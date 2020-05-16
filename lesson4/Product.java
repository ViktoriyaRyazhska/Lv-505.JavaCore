package study.lesson4;

public class Product {
     private String name;
     private int price;
     private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product moreExpensive (Product product){
        if (this.price>product.price) {
            return this;
        }
        return product;
    }

    public Product biggerQuantity (Product product){
        if (this.quantity>product.quantity){
            return this;
        }
        return product;
    }
}
