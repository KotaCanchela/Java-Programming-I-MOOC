import java.util.Scanner;
public class TextUI {
    private Scanner scan;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scan, SimpleDictionary simpleDictionary) {
        this.scan = scan;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        // Ask the user for a command
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            //  if the command is "end" the UI prints "Bye bye!" and the method breaks.
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                // Add a word to the dictionary hashmap with its translation
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String translation = scan.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
            } else if (command.equals("search")) {
                // Text UI asks for word to be translated and returns its translation
                System.out.print("To be translated: ");
                String search = scan.nextLine();
                if (this.simpleDictionary.translate(search) == null) {
                    // If the word searched for is not found
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                System.out.println("Translation: " + this.simpleDictionary.translate(search));
                continue;
            }

            System.out.println("Unknown command");

            // Otherwise UI prints the message "Unknown command" and loops back to step 1
        }


    }
}
