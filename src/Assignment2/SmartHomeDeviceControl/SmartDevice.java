package Assignment2.SmartHomeDeviceControl;

public abstract class SmartDevice {

    private int deviceId;

    public SmartDevice(int deviceId) {
        this.deviceId = deviceId;
    }

    public void deviceInfo(){
        System.out.println("Device ID: " + deviceId);
    }








}
