import java.util.Scanner;

public class MenuRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menuTest = new Menu();

        while (true) {
            // Adds all unique user input into a list
            System.out.println("Please enter a meal to be added to the meal list: (empty to break)");
            String meal = scan.nextLine();
            if (meal.isEmpty()) {
                break;
            }
            menuTest.addMeal(meal);
        }
        // Prints all items from the list
        menuTest.printMeals();

        // Clear menu
        menuTest.clearMenu();
        System.out.println("Menu is cleared");
        // Print meals after cleared menu
        menuTest.printMeals();
    }
}
