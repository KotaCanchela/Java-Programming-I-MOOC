// Expand the previous program so that the main program asks the user for the number
// of times the phrase will be printed (i.e. how many times the method will be called).
import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int numberOfTimes = Integer.valueOf(scan.nextLine());
        for (int num = 0; num < numberOfTimes; num++) {
            printText();
        }
    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
