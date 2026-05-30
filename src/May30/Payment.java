package May30;

public  abstract class Payment {

    double balance;

    public Payment(double balance) {
        this.balance = balance;
    }

    void receipt(){
        System.out.println("this is receipt method");
    }

    abstract void pay(); /// abstract method
}
