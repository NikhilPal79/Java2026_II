package May30.Notify;

public class PushNotification extends Notification {

    public PushNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sending push ..." + message);
    }
}
