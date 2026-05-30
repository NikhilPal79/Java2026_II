package May30.Practice1;

public class SavingAccount extends BankAccount{
    public SavingAccount(int balance) {
        super(balance);
    }


    @Override
    void withdraw(int amount, int balance) {
        System.out.println("Withdrawing from SavingAccount : " + amount);
        System.out.println("New Balance : " + balance + amount);
    }
}
