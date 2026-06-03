package May30.Notify;

public class NotifyMain {
    static void main(String[] args) {

        Notification notify = new SmsNotification("WELCOME TO SYSTEM");
        notify.send();

        Notification notify2 = new EmailNotification("WELCOME TO SYSTEM");
        notify2.send();

        Notification notify3 = new PushNotification("WELCOME TO SYSTEM");
        notify3.send();





    }
}
