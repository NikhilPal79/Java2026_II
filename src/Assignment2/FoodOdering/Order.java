package Assignment2.FoodOdering;

public abstract class Order {

    private final int orderId;
    private final double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    abstract public void calculateFinalAmount();

    public void printOderSummary() {
        System.out.println("Order ID : " + orderId);
        System.out.println("Amount : " + amount);
    }
}
