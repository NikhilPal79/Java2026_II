package Assignment2.SmartHomeDeviceControl;

public class Main {
    static void main(String[] args) {

        SmartDevice smartDevice;
        smartDevice = new SmartFan(1);

        smartDevice = new SmartLight(2);


        Switchable switchable;
        switchable= new SmartFan(3);
        smartDevice.deviceInfo();
        switchable.turnOn();
        switchable.turnOff();


        switchable = new SmartLight(4);
        smartDevice.deviceInfo();
        switchable.turnOff();
        switchable.turnOn();







    }
}
