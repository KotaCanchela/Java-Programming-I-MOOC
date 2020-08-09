import java.util.Scanner;
// Write a program that reads user input until an empty line is entered.
// For each non-empty line the program splits the string by spaces and prints the first part of the string.
public class FirstWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
        }
    }
}
