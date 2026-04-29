package Object_Oriented_Programming_E_Commerce_Application;

public class Main {
    public static void main(String[] args) {
        User user = new User("Mehmet", "Büyükkaya", "Langa");

        Product toothpaste = new Product("Toothpaste", 2.99);
        Product toothbrush = new Product("Toothbrush", 1.99);
        Product shampoo = new Product("Shampoo", 4.99);

        Basket basket = new Basket();

        basket.addProductToBasket(toothpaste);
        basket.addProductToBasket(toothbrush);
        basket.addProductToBasket(shampoo);

        Payment payment = new Payment("Credit Card");

        Order order = new Order(user, basket, payment);
        order.placeOrder();
    }
}
