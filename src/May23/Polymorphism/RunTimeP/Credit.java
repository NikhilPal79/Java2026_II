package May23.Polymorphism.RunTimeP;

public class Credit extends Payment {

    @Override
    void pay() {
        System.out.println(" payment through credit");
    }
}
