import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declare variables for two containers which can hold 100L of water
        int capacity = 100;
        int firstValue = 0;

        int secondValue = 0;

        while (true) {
            System.out.println("First: " + firstValue + "/" + capacity);
            System.out.println("Second:" + secondValue + "/" + capacity);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    firstValue += amount;
                    if (firstValue > capacity) {
                        firstValue = capacity;
                    }
                }
            }

            if (command.equals("move") && amount > 0) {
                if (amount <= firstValue) {
                    secondValue += amount;
                    firstValue -= amount;
                    if (secondValue > capacity) {
                        secondValue = capacity;
                    }
                } else if (amount > firstValue) {
                    secondValue += firstValue;
                    firstValue -= amount;
                    if (secondValue > capacity) {
                        secondValue = capacity;
                    }
                }
            }

            if (command.equals("remove") && amount > 0) {
                if (amount <= secondValue) {
                    secondValue -= amount;
                } else {
                    secondValue = 0;
                }
            }


        }
    }

}
