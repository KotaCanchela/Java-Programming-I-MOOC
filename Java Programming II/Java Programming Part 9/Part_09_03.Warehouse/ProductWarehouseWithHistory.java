public class ProductWarehouseWithHistory extends ProductWarehouse {
    ChangeHistory histories;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.histories = new ChangeHistory();
        initialBalance = getBalance();
        this.histories.add(initialBalance);

    }

    public ChangeHistory history() {
        // Returns the product history
        return this.histories;
    }
}
