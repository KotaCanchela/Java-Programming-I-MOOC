import java.util.Scanner;

//Write a program that reads numbers from the user until the user inputs a number 0.
// After this the program outputs the sum of the numbers. The number zero does not
// need to be added to the sum, even if it does not change the results.

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());
            if (input != 0) {
                num  += input;
            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + num);
    }
}
