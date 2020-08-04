import java.util.Scanner;

// Implement a program which calculates the sum of a closed interval, and prints it.
// Expect the user to write the smaller number first and then the larger number.
// You can base your solution to this exercise to the solution of last exercise — add
// the functionality for the user to enter the starting point as well.

import java.util.Scanner;
// Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number?");
        int num = Integer.valueOf(scan.nextLine());

        System.out.println("Second number?");
        int numSecond = Integer.valueOf(scan.nextLine());

        int testSecond = 0;

        while (num <= numSecond) {
            testSecond += num;
            num++;
        }
        System.out.println("The sum is " + testSecond);
    }
}
