import java.util.Scanner;

// Write a program that asks the user for input until the user inputs 0. After this,
// the program prints the average of the positive numbers (numbers that are greater than zero).
//If no positive number is inputted, the program prints "Cannot calculate the average"
public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberSum = 0;
        int numTracker = 0;
        while (true) {
            System.out.println("Give a number (0 to exit): ");
            int input = Integer.valueOf(scan.nextLine());
            if (input == 0) {
                break;
            } else if (input < 0) {
                continue;
            }
            numTracker += 1;
            numberSum += input;
        }
        if (numTracker > 0) {
            double average = (double) numberSum / numTracker;
            System.out.println(average);
        } else if (numTracker == 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
