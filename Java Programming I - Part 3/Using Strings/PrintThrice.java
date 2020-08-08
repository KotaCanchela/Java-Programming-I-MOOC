
import java.util.Scanner;
// Write a program, that reads a string from the user and then prints it three times.
public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        System.out.println(word + word + word);
    }
}
