import java.util.Scanner;

public class OperationsMain {
    public static void main(String[] args) {
        UI ui = new UI(new Scanner(System.in));

        ui.addOperation(new PlusOperation());

        ui.start();

    }
}
