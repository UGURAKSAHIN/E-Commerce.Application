package Object_Oriented_Programming_E_Commerce_Application;

import java.util.ArrayList;
import java.util.List;

class User {
    private final String userName;
    private final String userSurname;
    private final String address;
    private final String dateOfBirth;
    public User(String userName, String userSurname, String address, String dateOfBirth) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserSurname() {
        return userSurname;
    }
    public String getAddress() {
        return address;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
class product {
    private String name;
    private double price;
    public product() {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice(product toothpaste) {
        return price;
    }
}
public class Order {
    private final User user;
    private final List<Product> products;
    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }
    public void addProductToOrder(Product product) {
        products.add(product);
    }
    // Method to calculate total price
    private double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    // Method to display order summary
    private void displayOrderSummary() {
        System.out.println(user.getUserName() + " " +
                user.getUserSurname());
        System.out.println(user.getAddress());
        for (Product product : products) {
            System.out.println(product.getName() + ": $" +
                    product.getPrice());
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }
    public void placeOrder() {
        displayOrderSummary();
    }
}
class OrderTest {
    public static void main(String[] args) {
        User user = new User("Mehmet", "Büyükkaya", "Langa",
                "01.01.1990");
        Product toothpaste = new Product("Toothpaste", 2.99);
        Product toothbrush = new Product("Toothbrush", 1.99);

        Product shampoo = new Product("Shampoo", 4.99);
        Order order = new Order(user);
        order.addProductToOrder(toothpaste);
        order.addProductToOrder(toothbrush);
        order.addProductToOrder(shampoo);
        order.placeOrder();
    }
}
