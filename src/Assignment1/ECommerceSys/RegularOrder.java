package Assignment1.ECommerceSys;

public class RegularOrder extends Order {


    @Override
    public void calculateFinalAmount(double amount) {
        System.out.println("final amount @ no discount = " + amount);

    }
}
