package May30.Practice2;

public class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("This is Car class overriding Vehicle abstract method ");
    }

    @Override
    void fuel() {
        System.out.println("This is Car is petrol vehicle ");
    }
}
