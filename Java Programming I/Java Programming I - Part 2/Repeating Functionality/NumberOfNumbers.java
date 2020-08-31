import java.util.Scanner;
// Write a program that reads values from the user until they input a 0. After this,
// the program prints the total number of inputted values. The zero that's used to exit
// the loop should not be included in the total number count.
public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scan.nextLine());
            if (number != 0) {
                num += 1;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + num);
    }
}
