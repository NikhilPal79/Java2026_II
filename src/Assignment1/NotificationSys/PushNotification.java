package Assignment1.NotificationSys;

public class PushNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("sending Push notification");
    }
}
