package May30.Abstract;

public  abstract class Payment {

    double balance;

    public Payment(double balance) {
        this.balance = balance;
    }

    void receipt(){
        System.out.println("this is receipt method");/// concrete method
    }

    public abstract void pay(); /// abstract method
}
