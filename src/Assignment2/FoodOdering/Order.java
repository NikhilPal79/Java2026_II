package Assignment2.FoodOdering;

public abstract class Order {
    private int orderId;
    private double orderAmount;

    public Order(int orderId, double orderAmount) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }



    abstract void calculateFinalAmount();

    public void printOrderSummary(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Amount: " + orderAmount);
    }
}
