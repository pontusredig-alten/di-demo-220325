package se.iths;

public class SMSService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Sending SMS with message: " + message;
    }
}
