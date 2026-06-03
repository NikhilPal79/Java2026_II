package May30.Abstract;

public class IntracPayment extends Payment {


    public IntracPayment(double balance) {
        super(balance);
    }

    @Override
    void pay() {
        System.out.println("payment done with interact  ");
    }
}
