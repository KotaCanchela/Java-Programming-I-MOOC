import java.util.Scanner;
// Write a program, which reads an integer from the user. Then the program prints numbers from that number to 100.
// You can assume that the user always gives a number less than 100. Below are some examples of the expected functionality.
public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int number = Integer.valueOf(scan.nextInt()); number <= 100; number++) {
            System.out.println(number);
        }
    }
}
