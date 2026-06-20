package May19.Inheritence;

public class Main {
    static void main(String[] args) {

        Car car = new Car();
        car.travel();

        Bus bus = new Bus();
        bus.commute();
        bus.startAndStop();

        Truck truck = new Truck();
        truck.transport();

        Vehicle vehicle = new Vehicle();

        vehicle.startAndStop();

    }
}
