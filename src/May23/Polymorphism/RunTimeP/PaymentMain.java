package May23.Polymorphism.RunTimeP;

public class PaymentMain {
    public static void main(String[] args) {

        Payment payment = new Debit();
        payment.pay();

        Payment  payment2 = new Credit();
        payment2.pay();

        Payment  payment3 = new Upi();
        payment3.pay();


    }
}
