package May30.Practice1;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    void withdraw(int amount,int balance) {
        System.out.println("Withdrawing from CheckingAccount : " + amount);
        System.out.println("New Balance : " + balance + amount);
    }
}
