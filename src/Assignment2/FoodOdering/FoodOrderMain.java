package Assignment2.FoodOdering;

public class FoodOrderMain {
    static void main(String[] args) {

        Order order;
        order= new RegularOrder(1002,500.0);
        order.calculateFinalAmount();
        order.printOrderSummary();
        System.out.println();

        order = new PremiumOrder(1003,800.0);
        order.calculateFinalAmount();
        order.printOrderSummary();
        System.out.println();

        PaymentMode payment;
        payment= new CardPayment();
        payment.pay(100.0);

        payment = new UpiPayment();
        payment.pay(200.0);







    }
}
