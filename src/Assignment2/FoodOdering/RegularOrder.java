package Assignment2.FoodOdering;

public class RegularOrder extends Order {


    public RegularOrder(int orderId, double orderAmount) {
        super(orderId, orderAmount);
    }

    @Override
    void calculateFinalAmount() {
        System.out.println("final amount : " + getOrderAmount() );
    }

    @Override
    public void printOrderSummary() {
        super.printOrderSummary();
    }
}
