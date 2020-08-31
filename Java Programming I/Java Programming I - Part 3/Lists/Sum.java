import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

// Create the method public static int sum(ArrayList<Integer> numbers) in the exercise template.
// The method is to return the sum of the numbers in the parameter list.
public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbersSum = new ArrayList<>();
        // Add int numbers to the list, 9999 to break.
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == 9999) {
                break;
            }
            numbersSum.add(input);
        }
        System.out.println(sum(numbersSum));
        // Test to add two more values to the numbersSum list
        numbersSum.add(5);
        numbersSum.add(6);
        System.out.println(sum(numbersSum));
    }
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
}
