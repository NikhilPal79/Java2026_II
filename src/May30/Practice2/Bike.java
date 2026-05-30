package May30.Practice2;

public class Bike extends  Vehicle{

    @Override
    void move() {
        System.out.println("This is Bike class overriding Vehicle abstract method ");
    }

    @Override
    void fuel() {
        System.out.println("This is Bike is diesel vehicle ");
    }
}
