
import java.util.ArrayList;
import java.util.Scanner;
// Continue developing the program so that it finds the greatest number in the list
// and prints its value after reading all the numbers. The programming should work in the following manner.

public class GreatestInList {

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
        int store = list.get(0);
        System.out.println("");
        for (int num = 0; num < list.size() -1; num++) {
            if (list.get(num) > list.get(num+1)) {
                store = list.get(num);
            } else {
                store = list.get(num + 1);
            }
        }

        System.out.println("The greatest number: " + store);
    }
}
