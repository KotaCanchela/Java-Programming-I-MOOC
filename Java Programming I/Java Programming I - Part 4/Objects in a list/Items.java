import java.util.ArrayList;
import java.util.Scanner;
// Write a program that reads names of items from the user. If the name is empty, the program stops reading.
// Otherwise, the given name is used to create a new item, which you will then add to the items list.
//
// Having read all the names, print all the items by using the toString method of the Item class.
// The implementation of the Item class keeps track of the time of creation, in addition to the name of the item.
public class Items {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Item(name));
        }

        for (Item item: items) {
            System.out.println(item);
        }
    }
}
