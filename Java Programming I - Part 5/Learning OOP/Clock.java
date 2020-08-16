
public class Clock {
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            // Timer runs endlessly, counting every 10ms
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.print("Error: " + e);
            }

        }
    }
}
