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
                int checkCont = firstContainer.contains();
                if (checkCont + amount > 100) {
                    int excess = (checkCont + amount) - 100;
                    System.out.println(excess);
                    firstContainer.remove(excess);
                    secondContainer.add(excess);
                } else if (amount <= firstContainer.contains()){
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                }

            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}

