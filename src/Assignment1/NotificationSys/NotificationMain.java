package Assignment1.NotificationSys;

public class NotificationMain {
    static void main(String[] args) {


        Notification notification;
        notification = new EmailNotification();
        notification.send("from email class"); /// becz we mention the return type as string message in Notification class method

        notification = new PushNotification();
        notification.send("from push class ");

        notification = new SMSNotification();
        notification.send("from SMS class ");



    }
}
