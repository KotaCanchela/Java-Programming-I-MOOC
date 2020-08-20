import java.util.ArrayList;
public class Package {
    private ArrayList<Gift> packageGifts;

    public Package() {
        this.packageGifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        // Adds the gift passed as a parameter to the package
        this.packageGifts.add(gift);
    }

    public int totalWeight() {
        // Returns the total weight of the package's gifts
        int totalWeight = 0;
        for (Gift number: packageGifts) {
            totalWeight += number.getWeight();
        }
        return totalWeight;

    }
}
