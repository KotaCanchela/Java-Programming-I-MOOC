
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // Implement the decrement() method in the class body in such a way that it decrements the value variable
        // of the object it's being called on by one. Once you're done with the decrement() method,
        // the main program of the previous example should work to produce the example output.
        if (this.value > 0) {
            this.value--;
        }
    }
    public void reset() {
        // Create the method public void reset() for the counter that resets the value of the counter to 0
        this.value = 0;
    }

    // the other methods go here
}
