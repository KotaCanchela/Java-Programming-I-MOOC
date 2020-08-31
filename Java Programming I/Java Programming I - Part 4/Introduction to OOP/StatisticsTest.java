import java.util.Scanner;

public class StatisticsTest {
    public static void main(String[] args) {
        Statistics allSum = new Statistics();
        Statistics oddSum = new Statistics();
        Statistics evenSum = new Statistics();
        Scanner scan = new Scanner(System.in);

        // Write a program that asks the user for numbers until the user enters -1.
        // The program will then provide the sum of all numbers, even numbers, and odd numbers.
        System.out.println("Enter numbers: ");
        while (true) {
            int num = Integer.valueOf(scan.nextLine());
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                // Adds sum to the even numbers and allSum
                allSum.addNumber(num);
                evenSum.addNumber(num);
            } else {
                // adds sum to odd numbers and allSum
                allSum.addNumber(num);
                oddSum.addNumber(num);
            }
        }
        System.out.println("Sum: " + allSum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());


    }
}
