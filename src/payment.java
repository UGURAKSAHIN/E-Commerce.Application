package Object_Oriented_Programming_E_Commerce_Application;

public class Payment {
    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay(double amount) {
        System.out.printf("Payment completed with %s. Amount: $%.2f%n", paymentMethod, amount);
    }
}
