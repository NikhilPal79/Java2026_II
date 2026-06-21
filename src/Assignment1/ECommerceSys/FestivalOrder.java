package Assignment1.ECommerceSys;

public class FestivalOrder extends Order {

    @Override
    public void calculateFinalAmount(double amount) {
        System.out.println("final amount @ 20% discount = " +(amount - (amount * 0.20) ));
    }
}
