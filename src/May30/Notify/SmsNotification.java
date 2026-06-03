package May30.Notify;

public class SmsNotification extends Notification {


    public SmsNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sending SMS..." + message);
    }
}
