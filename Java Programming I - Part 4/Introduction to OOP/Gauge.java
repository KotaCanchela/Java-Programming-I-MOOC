public class Gauge {
    private int value;

    public Gauge() {
        // Method with 0 parameters
        // Sets initial value to 0
        this.value = 0;
    }

    public void increase() {
        // Growths the value instance by 1, does not exceed 5.
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        // Decrease the value instance by 1, does not go into the negative numbers.
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        // Returns the value variable's value
        return this.value;
    }

    public boolean full() {
        // Returns true if the instance variable value has the value 5. Otherwise returns false.
        return this.value == 5;
    }

}
