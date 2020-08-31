public class Container {
    private int capacity;
    private int container;

    public Container() {
        // Initialise attributes for the container
        this.capacity = 100;
        this.container = 0;
    }

    public int contains() {
        // Returns the amount of liquid in a container as an integer
        return this.container;
    }

    public void add(int amount) {
        // Adds a positive amount of liquid to the container. Can not exceed capacity
        if (amount < 0) {
            return;
        }
        this.container += amount;
        if (this.container > this.capacity) {
            this.container = this.capacity;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.container -= amount;

        if (this.container < 0) {
            this.container = 0;
        }
    }

    public String toString() {
        return this.container + "/" + this.capacity;
    }
}
