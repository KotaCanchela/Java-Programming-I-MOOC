// Create a class Product that represents a store product. The product should have a price
// (double), a quantity (int) and a name (String).
//
// The class should have:
//
// the constructor public Product (String initialName, double initialPrice, int initialQuantity)
// a method public void printProduct() that prints product information in the following format:
// Banana, price 1.1, 13 pcs

public class Product {
    private double price;
    private int quantity;
    private String name;

    // Constructor creation.
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.name = initialName;
        this.quantity = initialQuantity;
    }

    // Method to print product information
    public void printProduct() {
        System.out.println(this.name +", price " + this.price + ", " + quantity + " pcs");
    }

}
