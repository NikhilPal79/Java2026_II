package Assignment1.NotificationSys;

public class SMSNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("sending SMS notification");
    }
}
