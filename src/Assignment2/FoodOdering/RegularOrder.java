package Assignment2.FoodOdering;

public class RegularOrder extends Order {
    public RegularOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void calculateFinalAmount() {
        System.out.println("Regular Order");
    }
}
