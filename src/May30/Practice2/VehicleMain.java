package May30.Practice2;

public class VehicleMain {
    static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.move();
        vehicle.fuel();
        System.out.println();
        Vehicle vehicle2 = new Bike();
        vehicle2.move();
        vehicle2.fuel();
    }
}
