import java.util.Scanner;
// Write a program that asks the user for input until the user inputs 0.
// After this the program prints the amount of numbers inputted and the
// sum of the numbers. The number zero does not need to be added to the sum, but adding it does not change the results.

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberTracker = 0;
        int sumOfTheNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());
            if (input == 0) {
                break;
            } else {
                sumOfTheNumbers += input;
                numberTracker += 1;
            }
        }
        System.out.println("Number of numbers: " + numberTracker);
        System.out.println("Sum of the numbers: " + sumOfTheNumbers);
    }
}
