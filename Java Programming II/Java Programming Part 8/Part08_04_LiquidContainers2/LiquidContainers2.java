import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {
                int excess = amount + secondContainer.contains();
                if (excess >= 100) {
                    int add = firstContainer.contains();
                    secondContainer.add(excess - 100);
                    firstContainer.remove(excess - 100);
                } else if (amount >= firstContainer.contains()){
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                } else {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
