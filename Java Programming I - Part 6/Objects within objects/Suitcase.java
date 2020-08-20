import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcases;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Item item: this.suitcases) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    public void addItem(Item item) {
        // Adds an item to the suitcase the weight should not exceed the total weight defined in the suitcase
        int sumWeight = 0;
        int weight = item.getWeight();
        for (Item items: this.suitcases) {
            sumWeight += items.getWeight();
        }
        if ((sumWeight += weight) <= maximumWeight) {
            suitcases.add(item);
        }
    }

    @Override
    public String toString() {
        // Returns the string "x items (y kg)"
        int numberOfItems = 0;
        int sumWeight = 0;
        String word = " item (";
        for (Item items: this.suitcases) {
            numberOfItems++;
            sumWeight += items.getWeight();
        }
        if (numberOfItems > 1) {
            word = " items (";
        }
        if (numberOfItems == 0) {
            return "no items (" + sumWeight + " kg)";
        }
        return numberOfItems + word + sumWeight + " kg)";
    }

    public void printItems() {
        // prints all items in the suitcase
        for (Item item: this.suitcases) {
            System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
        }
    }

    public Item heaviestItem() {
        // Returns the heaviest item in the class
        if (this.suitcases.isEmpty()) {
            return null;
        }
        Item heaviest = this.suitcases.get(0);
        for (Item item: this.suitcases) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
