
package Object_Oriented_Programming_E_Commerce_Application;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public void addProductToBasket(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the basket.");
    }

    public void displayBasket() {
        if (products.isEmpty()) {
            System.out.println("The basket is empty.");
            return;
        }

        System.out.println("Products in your basket:");

        for (Product product : products) {
            System.out.printf("%s: $%.2f%n", product.getName(), product.getPrice());
        }

        System.out.printf("Total: $%.2f%n", getTotalPrice());
    }

    public double getTotalPrice() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}
