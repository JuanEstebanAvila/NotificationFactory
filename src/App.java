public class App {
    public static void main(String[] args) {
        NotificationSimpleFactory factory = new NotificationSimpleFactory();
        NotificationService service = new NotificationService(factory);

        service.sendNotification("email", "atjuan.64@gmail.com", "Gracias por suscribirte");
        service.sendNotification("sms", "3001234567", "Tu código de verificación es 4821");
        service.sendNotification("whatsapp", "@AndresParra", "Tu pedido va en camino");
        service.sendNotification("telegram", "Javier Rodriguez", "Tipo no soportado");
    }
}
