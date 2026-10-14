public class NotificationSimpleFactory {

    public Notification createNotification(String type) {
        Notification notification = null;

        if (type.equalsIgnoreCase("email")) {
            notification = new Email();
        } else if (type.equalsIgnoreCase("sms")) {
            notification = new SMS();
        } else if (type.equalsIgnoreCase("whatsapp")) {
            notification = new WhatsApp();
        }
        return notification;
    }
}
