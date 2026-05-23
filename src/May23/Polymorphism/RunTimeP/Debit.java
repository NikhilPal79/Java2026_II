package May23.Polymorphism.RunTimeP;

public class Debit extends Payment {

    @Override
    void pay() {
        System.out.println(" payment through debit");
    }
}
