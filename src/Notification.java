public abstract class Notification {

    protected String recipient;
    protected String message;

    public void prepare(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
        System.out.println("Preparando " + getClass().getSimpleName() + " para " + recipient);
    }

    public abstract void send();

    public void log() {
        System.out.println("Registro: " + getClass().getSimpleName() + " enviada a " + recipient + "\n");
    }
}
