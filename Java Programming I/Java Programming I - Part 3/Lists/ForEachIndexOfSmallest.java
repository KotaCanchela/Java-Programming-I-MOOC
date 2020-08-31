// Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops.
// After this the program will print the smallest number in the list, and also the indices where that number is found.
// Notice: the smallest number can appear multiple times in the list.
import java.util.ArrayList;
import java.util.Scanner;

public class ForEachIndexOfSmallest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listStore = new ArrayList<>();
        // Ask for user input. (9999 to break)
        while (true) {
            int store = Integer.valueOf(scan.nextLine());
            if (store == 9999) {
                break;
            }
            listStore.add(store);
        }
        // Declare variables smallestNumber and index
        int smallestNumber = listStore.get(0);
        int index = listStore.get(0);

        // Retrieve smallest number and store it in the variable smallestNumber
        System.out.println("");
        for (int num: listStore) {
            if (listStore.get(num) < smallestNumber) {
                smallestNumber = listStore.get(num);
            }
        }
        System.out.println("Smallest number: " + smallestNumber);
        // Iterate through the list and find the indexes containing the smallest number
        for (int start: listStore) {
            if (listStore.get(start) == smallestNumber) {
                System.out.println("Found at index: " + start);
            }
        }

    }
}
