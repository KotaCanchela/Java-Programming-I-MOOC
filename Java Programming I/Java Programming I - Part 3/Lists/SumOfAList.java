
import java.util.ArrayList;
import java.util.Scanner;
// Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
public class SumOfAList {

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
        // Declare variable for sum to be calculated
        int sum = 0;
       for (int num: list) {
           sum += num; // Each integer (num) in the list (list) will be added to the sum variable.
       }
       System.out.println("Sum: " + sum);
    }
}
