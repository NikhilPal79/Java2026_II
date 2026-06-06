package June06;

public class Bank {

    double balance;

    public double getBalance() {
        return balance;
    }

    void withdraw(int amount) {

        if(amount > balance){
            throw  new InsufficientBalance("Insufficient Balance");
        }
        balance = balance - amount;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }
}
