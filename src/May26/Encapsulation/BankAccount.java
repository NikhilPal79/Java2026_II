package May26.Encapsulation;

public class BankAccount {

    private int accountNumber;
    private double balance;


    public BankAccount(Integer accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void  deposit( double amount) {
        this.balance = balance + amount;
    }

    void   withdraw( double amount) {
        this.balance = balance - amount;
    }

    void showBalance() {
        if (this.balance <= 0 && this.balance < -1) {
            System.out.println("Insufficient balance");
        }else  {
            System.out.println("Your balance is " + this.balance);
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
