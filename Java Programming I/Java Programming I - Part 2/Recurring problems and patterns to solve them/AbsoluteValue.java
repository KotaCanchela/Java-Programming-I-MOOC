import java.util.Scanner;

// Write a program that reads an integer from the user. If the number is less than 0,
// the program prints the given integer multiplied by -1. In all other cases,
//the program prints the number itself. A few examples of how the program's expected to function are shown below:

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());

        if (number < 0) {
            System.out.println(number * -1);
        } else {
            System.out.println(number);
        }
    }
}