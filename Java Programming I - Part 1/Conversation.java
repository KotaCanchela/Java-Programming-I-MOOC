
import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings how are you doing?");
        String first_response = scanner.nextLine();

        System.out.println("Oh, how interesting. Tell me more!");
        String second_response = scanner.nextLine();

        System.out.println("Thanks for sharing!");
    }
}