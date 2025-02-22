package Object_Oriented_Programming_E_Commerce_Application;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;

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
}
class Basket {
    // List to hold products in the basket
    private List<Product> products;
    // Constructor to initialize the basket with an empty product list
    public Basket() {
        products = new ArrayList<>();
    }
    // Method to add a product to the basket
    public void addProductToBasket(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the basket");
    }
    // Method to display all products in the basket
    public void displayBasket() {
        if (products.isEmpty()) {
            System.out.println("The basket is empty.");
        }
        else {
            System.out.println("Products in your basket:");
            for (Product product : products) {
                System.out.println(product.getName() + ": $" +
                        product.getPrice());

            }
        }
    }
    public static void main(String[] args) {
// Create some products
        Product toothpaste = new Product("Toothpaste", 2.99);
        Product toothbrush = new Product("Toothbrush", 1.99);
        Product shampoo = new Product("Shampoo", 4.99);
// Create a basket to hold products
        Basket basket = new Basket();
// Add products to the basket
        basket.addProductToBasket(toothpaste);
        basket.addProductToBasket(toothbrush);
        basket.addProductToBasket(shampoo);
// Display all products in the basket
        basket.displayBasket();
    }
}
