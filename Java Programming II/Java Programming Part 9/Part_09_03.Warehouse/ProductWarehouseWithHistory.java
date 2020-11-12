public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory histories;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.histories = new ChangeHistory();
        this.addToWarehouse(initialBalance);
        this.histories.add(initialBalance);

    }

    public String history() {
        // Returns the product history
            return this.histories.toString();
    }
}
