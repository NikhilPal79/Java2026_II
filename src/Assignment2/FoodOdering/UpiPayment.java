package Assignment2.FoodOdering;

public class UpiPayment implements PaymentMode {


    @Override
    public void pay(Double amount) {
        System.out.println("payment done by upi ");
    }
}
