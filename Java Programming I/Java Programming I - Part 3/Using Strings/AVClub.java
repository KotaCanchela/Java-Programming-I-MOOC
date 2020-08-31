import java.util.Scanner;
// Write a program that reads user input until an empty line. For each non-empty string, the program splits the string
// by spaces and then prints the pieces that contain av, each on a new line.
public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");
            for (String piece: pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                } else {
                    continue;
                }
            }
        }
    }
}
