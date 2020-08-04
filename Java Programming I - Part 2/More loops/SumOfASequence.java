import java.util.Scanner;
// Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Last number?");
        int num = Integer.valueOf(scan.nextLine());
        int test = 0;
        int testSecond = 0;
        while (test < num) {
            test++;
            testSecond += test;
        }
        System.out.println("The sum is " + testSecond);
    }
}
