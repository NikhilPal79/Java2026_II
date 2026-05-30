package May30;

public class PaymentMain {
    public static void main(String[] args) {

        Payment payment = new CardPayment(10);
        payment.pay();
        payment.receipt();
        System.out.println();
        Payment  payment2 = new IntracPayment(20);
        payment2.pay();
        payment2.receipt();
    }
}
