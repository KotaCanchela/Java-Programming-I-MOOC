
import java.util.ArrayList;
import java.util.Scanner;
// Modify so that when the program quits reading, the program prints the number of values on the list.
public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            // Entering a blank string exits the loop
            if (input.equals("")) {
                break;
            }

            list.add(input); // adding the string values to a list called list
        }
        System.out.println("In total: " + list.size());

    }
}
