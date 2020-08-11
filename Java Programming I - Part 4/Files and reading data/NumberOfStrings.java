import java.util.Scanner;
// Write a program that reads strings from the user until the user inputs the string "end". At that point,
// the program should print how many strings have been read. The string "end" should not be included in the
// number strings read. You can find some examples below of how the program works.
public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
