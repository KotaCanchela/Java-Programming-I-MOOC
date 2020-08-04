import java.util.Scanner;

// 5 part exercise

// PART 1 READING: Implement a program that asks the user for numbers (the program first prints "Write numbers: ")
// until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.


// PART 2 SUM OF NUMBERS: Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

// PART 3 SUM AND THE NUMBER OF NUMBERS: Extend the program so that it also prints the number of numbers
// (not including the -1) the user has written.

// PART 4 AVERAGE OF NUMBERS: Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.

// PART 5 EVEN AND ODD NUMBERS: Extend the program so that it prints the number of even and odd numbers (excluding the -1).
public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                sum += input;
                numberOfNumbers++;
                even++;
            } else {
                sum += input;
                numberOfNumbers++;
                odd++;
            }

        }
        double mean = (double) sum / numberOfNumbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + mean);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
