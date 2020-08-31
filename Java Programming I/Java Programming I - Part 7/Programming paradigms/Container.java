public class Container {

    private int value;
    private int capacity;

    public Container() {
        this.value = 0;
        this.capacity = 100;
    }

    public int contains() {
        return value;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.value += amount;
            if (this.value > this.capacity) {
                this.value = this.capacity;
            }
        }
        if (this.value < amount) {
            this.value = this.capacity;
        }

    }

    public void remove(int amount) {
        this.value -= amount;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    public String toString() {
        return this.value + "/" + capacity;
    }


}
