package Assignment2.FoodOdering;

import May30.Abstract.Payment;

public class CardPayment extends Payment {
    public CardPayment(double balance) {
        super(balance);
    }

    @Override
    public void pay() {

    }
}
