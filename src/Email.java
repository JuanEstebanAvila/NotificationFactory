public class Email extends Notification {

    @Override
    public void send() {
        System.out.println("EMAIL enviando a la dirección " + recipient + ": " + message);
    }
}
