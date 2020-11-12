import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> warehouseStatus;

    public ChangeHistory() {
        // Creates an empty ChangeHistory object
        this.warehouseStatus = new ArrayList<>();
    }

    public void add(double status) {
        // Adds the provided status as the latest amount to remember in the change history
        this.warehouseStatus.add(status);
    }

    public void clear() {
        // Empties the history
        this.warehouseStatus.clear();
    }

    public String toString() {
        return this.warehouseStatus.toString();
    }

    public double maxValue() {
        // Returns the largest value in the change history. If the history is empty the method should return 0.
        if (this.warehouseStatus.isEmpty()) {
            return 0;
        }
        double max = 0.0;

        max = Collections.max(this.warehouseStatus);
        return max;
    }

    public double minValue() {
        // Returns the smallest value in the change history. If the history is empty, the method should return 0
        if (this.warehouseStatus.isEmpty()) {
            return 0;
        }

        double min = 0.0;
        min = Collections.min(this.warehouseStatus);

        return min;
    }

    public double average() {
        // Returns the average of the values in the change history. If the history is empty, the method should return 0.
        if (this.warehouseStatus.isEmpty()) {
            return 0;
        }

        double average = 0.0;
        int count = 0;

        for (double num: this.warehouseStatus) {
            average += num;
            count++;
        }

        average = average / count;
        return average;
    }

}
