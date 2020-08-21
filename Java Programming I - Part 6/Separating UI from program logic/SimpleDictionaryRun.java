import java.util.Scanner;

public class SimpleDictionaryRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scan, dictionary);
        textUI.start();

    }
}
