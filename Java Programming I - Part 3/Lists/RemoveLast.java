// Create the method public static void removeLast(ArrayList<String> strings) in the exercise template.
// The method should remove the last value in the list it receives as a parameter.
// If the list is empty, the method does nothing.
import java.util.Scanner;
import java.util.ArrayList;
public class RemoveLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // empty string to break list.
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println(list);
        removeLast(list);
        System.out.println(list);
    }
    public static void removeLast(ArrayList<String> removeInt) {
        // Method removes last value in a list.
        if (removeInt.size() == 0) {
            return;
        }
        removeInt.remove(removeInt.size() -1);
    }
}
