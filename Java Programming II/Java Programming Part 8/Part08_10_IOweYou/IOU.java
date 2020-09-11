import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iOweYou;

    public IOU() {
        // Creates new IOU
        this.iOweYou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        // Saves the amount owed and the person owed to the IOU
        Double userAmount = this.iOweYou.getOrDefault(toWhom, 0.0);

        amount += userAmount;
        this.iOweYou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        // Returns the amount owed to the person whose name is given as a parameter.
        // If the person can't be found then it returns 0.
        return this.iOweYou.getOrDefault(toWhom, 0.0);
    }
}
