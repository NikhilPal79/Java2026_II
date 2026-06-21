package Assignment1.ECommerceSys;

public class OrderMain {
    static void main(String[] args) {

        Order order;
        order = new RegularOrder();
        order.calculateFinalAmount(5000.0);

        order= new PrimeOrder();
        order.calculateFinalAmount(5000.0);

        order= new FestivalOrder();
        order.calculateFinalAmount(5000.0);

    }
}
