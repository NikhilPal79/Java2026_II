package Assignment2.SmartHomeDeviceControl;

public class SmartLight extends SmartDevice implements Switchable {
    public SmartLight(int deviceId) {
        super(deviceId);
    }

    @Override
    public void turnOn() {
        System.out.println(" SmartLight Turning on");
    }

    @Override
    public void turnOff() {

        System.out.println(" SmartLight Turning off");
    }
}
