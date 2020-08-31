import java.util.Scanner;

public class JokeManagerUI {
    private JokeManager jokeManager;
    private Scanner scan;

    public JokeManagerUI(JokeManager jokeManager, Scanner scan) {
        this.jokeManager = jokeManager;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scan.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String jokeAdd = scan.nextLine();
                this.jokeManager.addJoke(jokeAdd);
            }

            if (command.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            }

            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }

        }
    }

}
