import java.util.ArrayList;
public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        // Adds a meal to the list. If the meal already exists, then it is not added again
        if (!(this.meals.contains(meal))) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        // Prints the meals
        for (String meal: this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        // Clears the menu
        this.meals.clear();
    }
}
