package Object_Oriented_Programming_E_Commerce_Application;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private double price;

    // List to hold products in the basket
    private List<product> products;

    // Constructor to initialize product list
    public Product() {
        products = new ArrayList<>();
    }

    // Constructor for creating a specific product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to add a product to the basket
    public void addProductToBasket(product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the basket");
    }

    // Method to display all products in the basket
    public void displayBasket() {

        for (Object_Oriented_Programming_E_Commerce_Application.product product : products) {
            System.out.println(product.getName() + ":" + "$" + product.getPrice());
        }
    }

    public static void main(String[] args) {
        // Create some products
        product toothpaste = new product();
        product toothbrush = new product();
        product shampoo = new product();

        // Create a basket to hold products
        product basket = new product();

        // Add products to the basket
        basket.addProductToBasket(toothpaste);
        basket.addProductToBasket(toothbrush);
        basket.addProductToBasket(shampoo);

        // Display all products in the basket;

        basket.toString();
    }

}

