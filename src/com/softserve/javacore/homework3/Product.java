package com.softserve.javacore.homework3;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public static void main(String[] args) {
        Product socks = new Product("Nike", 5, 3);
        Product sneakers = new Product("Asics", 100, 1);
        Product skirt = new Product("Zara", 25.5, 2);
        Product bag = new Product("Mango", 120, 1);

        Product theMostExpesiveProduct;

        if (socks.getPrice() > sneakers.getPrice()) {
            theMostExpesiveProduct = socks;
        } else {
            theMostExpesiveProduct = sneakers;
        }

        if (theMostExpesiveProduct.getPrice() > skirt.getPrice()) {
            theMostExpesiveProduct = theMostExpesiveProduct;
        } else {
            theMostExpesiveProduct = skirt;
        }

        if (theMostExpesiveProduct.getPrice() > bag.getPrice()) {
            theMostExpesiveProduct = theMostExpesiveProduct;
        } else {
            theMostExpesiveProduct = bag;
        }

        System.out.println(theMostExpesiveProduct.getName() + " " + theMostExpesiveProduct.getQuantity());


        Product theBiggestQuantity;

        if (socks.getQuantity() > sneakers.getQuantity()) {
            theBiggestQuantity = socks;
        } else {
            theBiggestQuantity = sneakers;
        }

        if (theBiggestQuantity.getQuantity() > skirt.getQuantity()) {
            theBiggestQuantity = theBiggestQuantity;
        } else {
            theBiggestQuantity = skirt;
        }

        if (theBiggestQuantity.getQuantity() > bag.getQuantity()) {
            theBiggestQuantity = theBiggestQuantity;
        } else {
            theBiggestQuantity = bag;
        }

        System.out.println(theBiggestQuantity.getName());

    }


}