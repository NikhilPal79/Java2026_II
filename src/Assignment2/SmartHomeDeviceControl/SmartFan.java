package Assignment2.SmartHomeDeviceControl;

public class SmartFan extends SmartDevice implements Switchable {
    public SmartFan(int deviceId){
        super(deviceId);
    }

    @Override
    public void turnOn() {
        System.out.println(" SmartFan Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(" SmartFan Turning off");
    }
}
