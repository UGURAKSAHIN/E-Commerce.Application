package Object_Oriented_Programming_E_Commerce_Application;

public class Order {
    private User user;
    private Basket basket;
    private Payment payment;

    public Order(User user, Basket basket, Payment payment) {
        this.user = user;
        this.basket = basket;
        this.payment = payment;
    }

    public void placeOrder() {
        System.out.println("Order Summary");
        System.out.println("----------------");
        System.out.println("Customer: " + user.getFullName());
        System.out.println("Address: " + user.getAddress());

        basket.displayBasket();

        payment.pay(basket.getTotalPrice());

        System.out.println("Order placed successfully.");
    }
}
