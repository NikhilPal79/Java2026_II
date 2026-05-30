package May30.Practice1;

public abstract class BankAccount {

    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit(int amount, int balance) {
        System.out.println("Deposited amount : " + amount);
        System.out.println("New balance : " + balance + amount);
    }

    abstract void withdraw(int amount, int balance);
}
