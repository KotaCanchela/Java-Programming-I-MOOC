import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeManager;

    public JokeManager() {
        this.jokeManager = new ArrayList<>();
    }

    public void addJoke(String joke) {
        // Adds a joke to the jokemanager
        Scanner scan = new Scanner(System.in);
        this.jokeManager.add(joke);
    }

    public String drawJoke() {
        // Chooses one joke at random and returns it
        if (this.jokeManager.isEmpty()) {
            // Return statement if the joke manager is empty
            return "Jokes are in short supply.";
        }
        // Return a random joke
        Random draw = new Random();
        int index = draw.nextInt(this.jokeManager.size());
        String randomJoke = this.jokeManager.get(index);

        return randomJoke;
    }

    public void printJokes() {
        // Prints all the jokes stored in the joke manager
        for (String joke: this.jokeManager) {
            System.out.println(joke);
        }
    }
}
