package May30.Interface;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}
