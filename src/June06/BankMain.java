package June06;

public class BankMain {
    static void main(String[] args) {

        Bank bank = new Bank();
        bank.balance = 100;
        bank.deposit(500);
        try {
            bank.withdraw(2000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
