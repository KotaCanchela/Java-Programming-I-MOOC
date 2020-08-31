import java.util.Scanner;
// Write a program that reads names and birth years from the user until an empty line is entered.
// The name and birth year are separated by a comma.
// After that the program prints the longest name and the average of the birth years.
// If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        String word = "";

        while (true) {
            String input = scan.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            sum += Integer.valueOf(pieces[1]);
            counter += Integer.valueOf(pieces.length / 2);
            int length = pieces[0].length();
            if (length > word.length()) {
                word = pieces[0];
            }

        }
        double average = (double) sum / counter;
        System.out.println("Longest name: " + word);
        System.out.println("Average of the birth years: " + average);
    }
}
