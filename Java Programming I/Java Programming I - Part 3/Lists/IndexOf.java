
import java.util.ArrayList;
import java.util.Scanner;
// Expand the program by adding a functionality that asks the user for a number, and reports that number's
// index in the list. If the number is not found, the program should not print anything.

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("Search for?");
        int search = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == search) {
                System.out.println(search + " is at index " + i);
            }
        }
    }
}
