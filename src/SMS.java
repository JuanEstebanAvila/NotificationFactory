public class SMS extends Notification {

    @Override
    public void send() {
        System.out.println("SMS enviando al número " + recipient + ": " + message);
    }
}
