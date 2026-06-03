package May30.Notify;

public class EmailNotification extends Notification {


    public EmailNotification(String message) {
        super(message);
    }

    @Override
    void send() {
        System.out.println("Sending email..." + message);
    }
}
