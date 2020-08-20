import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> holds;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.holds = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        // Adds the specified luggage to the hold
        int sumWeight = 0;
        int weight = suitcase.totalWeight();
        for (Suitcase suitcases: this.holds) {
            sumWeight += suitcases.totalWeight();
        }
        if ((sumWeight += weight) <= this.maximumWeight) {
            this.holds.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase: this.holds) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        // Returns the string "x suitcases (y kg)"
        int numberOfSuitcases = 0;
        int sumWeight = 0;
        String word = " suitcase (";
        for (Suitcase suitcases: this.holds) {
            numberOfSuitcases++;
            sumWeight += suitcases.totalWeight();
        }
        if (numberOfSuitcases > 1) {
            word = " suitcases (";
        }
        if (numberOfSuitcases == 0) {
            return "no suitcases (" + sumWeight + " kg)";
        }
        return numberOfSuitcases + word + sumWeight + " kg)";    }
}
