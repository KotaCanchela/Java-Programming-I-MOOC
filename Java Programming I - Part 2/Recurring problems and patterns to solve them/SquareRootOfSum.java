import java.util.Scanner;

// Write a program that reads two integers from the user and prints the square root of the sum of these integers.
// The program does not need to work with negative values.
public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scan.nextLine());
        int secondNumber = Integer.valueOf(scan.nextLine());

        int sumOfNumbers = firstNumber + secondNumber;

        double squareRoot = Math.sqrt(sumOfNumbers);

        System.out.println(squareRoot);
    }
}