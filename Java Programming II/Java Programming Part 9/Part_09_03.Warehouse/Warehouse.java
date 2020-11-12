public class Warehouse {

    protected double capacity;
    protected double balance;

    public Warehouse(double capacity) {
        // Creates an empty warehouse which has the capacity provided as a parameter
        // If an invalid capacity is provided, then a useless warehouse is created
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }
        this.balance = 0.0;
    }

    public double getBalance() {
        // Returns the current balance of the warehouse
        return this.balance;
    }

    public double getCapacity() {
        // Returns the total capacity of the warehouse
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        // Returns how much space is left in the warehouse
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        // Adds balance to the warehouse, if negative, nothing changes, if everything doesn't fit, then the warehouse
        // is filled up and the rest is discarded.
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance += amount;
        } else {
            this.balance = this.capacity;
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
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
