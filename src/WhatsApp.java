public class WhatsApp extends Notification {

    @Override
    public void send() {
        System.out.println("WHATSAPP enviando al número " + recipient + ": " + message);
    }
}
