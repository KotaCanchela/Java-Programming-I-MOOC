public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        // Returns the name of the gift
        return this.name;
    }

    public int getWeight() {
        // Returns the weight of the gift
        return this.weight;
    }

    public String toString() {
        return this.getName() + "(" + this.getWeight() + " kg)";
    }
}
