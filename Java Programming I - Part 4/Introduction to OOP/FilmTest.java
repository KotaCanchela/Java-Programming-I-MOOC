import java.util.Scanner;

public class FilmTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Film test = new Film("Jurassic Park", 18);

        System.out.println(test.name() + " has an age rating of " + test.ageRating());

        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());

        if (age >= test.ageRating()) {
            System.out.println("You are old enough to watch " + test.name());
        } else {
            System.out.println("Unforunately you are not old enough to watch " + test.name());
        }

    }
}
