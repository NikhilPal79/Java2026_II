package May30.Interface;

public class VehicleMain {
    static void main(String[] args) {

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        car.start();

    }
}
