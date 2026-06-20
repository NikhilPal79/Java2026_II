package May19.Inheritence;

public class Bus extends Vehicle{

    public void commute(){
        System.out.println("Public commute");
    }

    @Override
    public void startAndStop() {
        System.out.println("Method in Bus class : Vehicle starts and stops");
    }
}
