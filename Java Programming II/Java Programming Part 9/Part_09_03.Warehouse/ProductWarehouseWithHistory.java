public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory histories;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.histories = new ChangeHistory();
        this.balance = initialBalance;
        this.histories.add(initialBalance);

    }

    public String history() {
        // Returns the product history
        return this.histories.toString();
    }

    public void addToWarehouse(double amount) {
        // Adds balance to the warehouse, if negative, nothing changes, if everything doesn't fit, then the warehouse
        // is filled up and the rest is discarded.
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance += amount;
            this.histories.add(this.balance);
        } else {
            this.balance = this.capacity;
            this.histories.add(this.balance);
        }
    }

    public double takeFromWarehouse(double amount) {
        // Take the desired amount from the warehouse, if the amount is negative then nothing is taken away
        // If the desired amount is more than there is, then we take everything and the warehouse is emptied
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            this.histories.add(allThatWeCan);
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        this.histories.add(this.balance);
        return amount;
    }
}

