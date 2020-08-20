import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcases;
    private int maximumWeight;
    private int startingWeight;
    private int numberOfItems;

    public Suitcase(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        this.startingWeight = 0;
        this.numberOfItems = 0;
    }

    public void addItem(Item item) {
        // Adds an item to the suitcase the weight should not exceed the total weight defined in the suitcase
        int currentWeight = startingWeight;
        currentWeight += item.getWeight();
        if (currentWeight < maximumWeight) {
            this.startingWeight = currentWeight;
            this.suitcases.add(item);
            this.numberOfItems++;
        }
    }

    public String toString() {
        // Returns the string "x items (y kg)"
        return this.numberOfItems + " items (" + this.startingWeight + " kg)";
    }
}
