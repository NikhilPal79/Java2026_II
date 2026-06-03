package Assignment2.FoodOdering;

public class PremiumOrder extends Order {
    public PremiumOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void calculateFinalAmount() {
        System.out.println("Premium Order");

    }
}
