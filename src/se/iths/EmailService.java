package se.iths;

public class EmailService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Sending email with message: " + message;
    }
}
