package Assignment1.NotificationSys;

public class EmailNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("sending email notification");
    }
}
