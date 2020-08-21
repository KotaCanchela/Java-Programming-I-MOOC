
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManagerRun {

    public static void main(String[] args) {

        JokeManager manager = new JokeManager();
        Scanner scan = new Scanner(System.in);

        JokeManagerUI ui = new JokeManagerUI(manager, scan);

        ui.start();
    }
}
