import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");

        String main_character = scanner.nextLine();
        System.out.println("What is their job?");
        String character_job = scanner.nextLine();
        System.out.println("Here is the story:");

        System.out.println("Once upon a time there was " + main_character + ", who was " + character_job + ".");

        System.out.println("On the way to work, " + main_character + " reflected on life.");

        System.out.println("Perhaps " + main_character + " will not be " + character_job + " forever.");

    }
}