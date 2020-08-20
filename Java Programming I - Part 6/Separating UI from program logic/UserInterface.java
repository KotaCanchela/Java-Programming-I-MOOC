import java.util.Scanner;
public class UserInterface {
    private WordSet wordSet;
    private Scanner scan;

    public UserInterface(WordSet wordSet, Scanner scan) {
        this.wordSet = wordSet;
        this.scan = scan;
    }

    public void start() {
        // Adds entered words into the WordSet and tells the user if they gave the same word twice
        while (true) {
            System.out.print("Enter a word: ");
            String word = scan.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }

            this.wordSet.add(word);
        }

        System.out.println("You gave the same word twice!");
        // Returns if the WordSet class contained palindromes

    }

}
