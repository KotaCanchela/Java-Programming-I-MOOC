import java.util.ArrayList;
import java.util.Scanner;
// Create the method public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
// in the exercise template. The method prints the numbers in the given list whose values
// are in the range [lowerLimit, upperLimit].
public class PrintInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbersGrab = new ArrayList<>();
        while (true) {
            int addInt = Integer.valueOf(scan.nextLine());
            if (addInt < 1) {
                break;
            }
            numbersGrab.add(addInt);
        }
        printNumbersInRange(numbersGrab, 2, 9);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
