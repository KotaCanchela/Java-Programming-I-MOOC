import java.util.Scanner;
public class WordSetRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WordSet wordSet = new WordSet();

        UserInterface newUserInterface = new UserInterface(wordSet, scan);

        newUserInterface.start();
        System.out.println(wordSet.palindromes());
    }
}
