public class DecreasingCounterTest {
    public static void main(String[] args) {

        // Initialise variable from DecreasingCounter class/method
        DecreasingCounter test = new DecreasingCounter(50);

        test.printValue();

        // Decrease value by 1.
        test.decrement();
        test.printValue();

        // Reset value
        test.reset();
        test.printValue();

    }
}
