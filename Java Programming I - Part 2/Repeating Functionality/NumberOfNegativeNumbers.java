import java.util.Scanner;

// Write a program that reads values from the user until they input a 0. After this,
// the program prints the total number of inputted values that are negative.
// The zero that's used to exit the loop should not be included in the total number count.
public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scan.nextLine());
            if (input < 0) {
                num += 1;
            } else if (input > 0) {
                continue;
            } else {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + num);
    }
}
