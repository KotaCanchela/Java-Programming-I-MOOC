public class AgentTest {
    public static void main(String[] args) {
        // Test for the toString() method

        Agent test = new Agent("James", "Bond");

        // No need to do test.toString(). Following statement does that automatically.

        System.out.println(test);
        System.out.println(test.toString()); // This does the same exact thing as the last line.
    }
}
