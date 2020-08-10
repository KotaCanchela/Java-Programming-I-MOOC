public class Statistics {
    private int count;
    private int sum;
    // the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
    // the average method tells the average of the numbers added (the average of an empty number statistics object is 0
    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        // a method addNumber adds a new number to the statistics
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        // a method getCount tells the number of added numbers
        return this.count;
    }

    public int sum() {
        // the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
        if (this.sum == 0) {
            return 0;
        }
        return this.sum;
    }

    public double average() {
        // the average method tells the average of the numbers added
        // (the average of an empty number statistics object is 0
        if (this.sum == 0) {
            return 0;
        }
        return (double) this.sum / this.count;
    }

}
