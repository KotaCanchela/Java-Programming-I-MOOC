
import java.util.ArrayList;
        import java.util.Scanner;
// Add the following functionality to it: after reading the inputs one more string is requested from the user.
// The program then will tell whether that string was found in the list or not.
public class OnTheList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        // Adds string names to the predefined list
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        // Prompts user to search for a string within the list and asks for input.
        System.out.println("Search for? ");
        String search = scan.nextLine();
        // Searches for the string within the list and prints if it was found or not.
        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

    }
}
