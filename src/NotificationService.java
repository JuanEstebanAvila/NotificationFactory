public class NotificationService {

    private final NotificationSimpleFactory factory;

    public NotificationService(NotificationSimpleFactory factory) {
        this.factory = factory;
    }

    public Notification sendNotification(String type, String recipient, String message) {
        Notification notification = factory.createNotification(type);

        if (notification == null) {
            System.out.println("Tipo de notificación no soportado: " + type + "\n");
            return null;
        }

        notification.prepare(recipient, message);
        notification.send();
        notification.log();
        return notification;
    }
}
