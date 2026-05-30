package May30;

public class CardPayment extends Payment{


    public CardPayment(double balance) {
        super(balance);
    }

    @Override
    public void pay() {
        System.out.println("payment done with credit card ");
    }
}
