public class Counter {
    private int value;

    public Counter() {
        // Constructor that sets the value to a default 0
        this.value = 0;
    }

    public Counter(int startValue) {
        // Constructor that sets the value to a given number in the parameter
        this.value = startValue;
    }

    public int value() {
        // Returns the value
        return this.value;
    }

    public void increase() {
        // Increases the value by 1
        this.value++;
    }

    public void increase(int increaseBy) {
        // Increases by a specific integer if it is above 0
        if (increaseBy > 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void decrease() {
        // Decreases the value by 1
        this.value--;
    }

    public void decrease(int decreaseBy) {
        // Decreases value by a specific integer if the integer is above 0
        if (decreaseBy > 0) {
            this.value = this.value - decreaseBy;
        }
    }

    @Override public String toString() {
        return "Counter value: " + this.value;
    }
}
