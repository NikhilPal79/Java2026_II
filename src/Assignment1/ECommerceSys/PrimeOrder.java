package Assignment1.ECommerceSys;

public class PrimeOrder extends Order {

    @Override
    public void calculateFinalAmount(double amount) {
        System.out.println( "final amount @ 10% discount = " +  ( amount - (amount * 0.10)) );
    }
}
