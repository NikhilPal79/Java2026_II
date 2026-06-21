package Assignment2.FoodOdering;

public class PremiumOrder extends Order {

    private final double deliveryFee = 5.0;
    private final double discount = 0.10 * getOrderAmount();

    public PremiumOrder(int orderId, double orderAmount) {
        super(orderId, orderAmount);
    }

    @Override
    void calculateFinalAmount() {
        System.out.println("Final amount : 10% discount + free delivery =  " + discount + deliveryFee);
    }

    @Override
    public void printOrderSummary() {
        super.printOrderSummary();
    }
}
