import java.util.Scanner;

// Write a program that reads an integer from the user. Next, the program prints numbers from 0
// to the number given by the user. You can assume that the user always gives a positive number.
// Below are some examples of the expected functionality.

public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        for (int test = 0; test < number; test++){
            System.out.println(test);
        }
        System.out.println(number);
    }
}
