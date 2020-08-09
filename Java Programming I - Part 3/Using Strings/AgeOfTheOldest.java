import java.util.Scanner;
import java.util.ArrayList;
// Write a program that reads names and ages from the user until an empty line is entered.
// The name and age are separated by a comma.

// After reading all user input, the program prints the age of the oldest person.
// You can assume that the user enters at least one person, and that one of the users is older than the others.
public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oldest = -1;
        while (true) {
            String nameAge = scan.nextLine();
            if (nameAge.equals("")) {
                break;
            }
            String[] pieces = nameAge.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
