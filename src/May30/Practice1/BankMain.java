package May30.Practice1;

public class BankMain {
    static void main(String[] args) {

        BankAccount bankAccount = new SavingAccount(500);
        System.out.println("Initial Balance : " + bankAccount.balance);
        bankAccount.deposit(200,500);
        bankAccount.withdraw(200,1000);
        System.out.println();


        BankAccount bankAccount2 = new CheckingAccount(500);
        System.out.println("Initial Balance : " + bankAccount2.balance);
        bankAccount2.deposit(3000,5000);
        bankAccount2.withdraw(1000,8000);

    }
}
