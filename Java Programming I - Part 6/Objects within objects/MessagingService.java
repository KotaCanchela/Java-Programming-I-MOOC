import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageService;

    public MessagingService() {
        this.messageService = new ArrayList<>();
    }

    public void add(Message message) {
        // Adds a message passed as a parameter to the messaging service as long as the message
        // content is at most 280 characters long
        if (message.getContent().length() <= 280) {
            this.messageService.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        // Returns the messages added to the messaging service
        return this.messageService;
    }
}
