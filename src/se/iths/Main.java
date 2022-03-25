package se.iths;

public class Main {

    public static void main(String[] args) {

        // Skapa dependency (görs i bakgrunden av CDI / Spring)
        MessageService service = new EmailService();

        // Injicera dependency i klienten/applikationen
        MessageSender messageSender = new MessageSender(service);

        // Använd objektet
        System.out.println(messageSender.sendMessage("Hej JU20 dec"));

    }
}
