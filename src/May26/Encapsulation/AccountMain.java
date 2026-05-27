package May26.Encapsulation;

public class AccountMain {
    public static void main(String[] args) {


        BankAccount ba = new BankAccount(123456789, 5000.0 );

        ba.deposit(500.0);
        ba.showBalance();


        ba.withdraw(5550.0);
        ba.showBalance();

        ba.setBalance(8000.0);
        System.out.println(ba.getBalance());

    }
}
