package May30.Abstract;

public class IntracPayment extends Payment {


    public IntracPayment(double balance) {
        super(balance);
    }

    @Override
    public void pay() {
        System.out.println("Inside IntracPayment method");
    }

}
