
// Scanner tool to be used for reading.
import java.util.Scanner;

public class MessageThreeTimes {
    public static void main(String[] args) {

        // Create the tool for reading, assign it to variable called "scanner"
        Scanner scanner = new Scanner(System.in);

        // Print user a message "Write a message"
        System.out.println("Write a message: ");

        // Read the user's string input, save it to the program's memory.
        String message = scanner.nextLine();

        // Print the user message twice
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}