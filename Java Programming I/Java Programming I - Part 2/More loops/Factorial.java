import java.util.Scanner;

// Implement a program which calculates the factorial of a number given by the user.

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int collecter = Integer.valueOf(scan.nextLine());
        int factorial = 1;
        int test = 0;
        while (test < collecter) {
            test++;
            factorial *= test;
        }
        if (factorial != 0) {
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Factorial: " + 1);
        }
    }
}
