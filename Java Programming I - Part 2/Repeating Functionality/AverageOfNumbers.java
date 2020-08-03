import java.util.Scanner;

// Write a program that asks the user for input until the user inputs 0. After this,
// the program prints the average of the numbers. The number zero does not need
// to be counted to the average. You may assume that the user inputs at least one number.
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int averageCollect = 0;
        int numTracker = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());
            if (input == 0) {
                break;
            }
            averageCollect += input;
            numTracker += 1;
        }
        if (numTracker != 0) {
            double average = (double) averageCollect / numTracker;
            System.out.println("Average of the numbers: " + average);
        }
    }
}
