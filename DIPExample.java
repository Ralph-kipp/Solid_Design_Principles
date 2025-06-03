package Solid_Design_Principles;

public class DIPExample {
    public static void main(String[] args) {
        MessageSender sender = new EmailSender();
        NotificationService service = new NotificationService(sender);
        service.notifyUser("bob@example.com", "You’ve got mail!");
    }
}

interface MessageSender {
    void send(String to, String message);
}

class EmailSender implements MessageSender {
    public void send(String to, String message) {
        System.out.println("Sending email to " + to + ": " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String user, String message) {
        sender.send(user, message);
    }
}
