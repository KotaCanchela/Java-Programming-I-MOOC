import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int capacity = 100;
        while (true) {
            // Print the values of both containers
            System.out.println("First: " + firstContainer + "/" + capacity);
            System.out.println("Second: " + secondContainer + "/" + capacity);
            System.out.println("What would you like to do? (add, move, remove) + amount");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                // enter "quit" to exit loop
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount <= 0) {
                // Loop back to start for negative numbers
                continue;
            }

            if (command.equals("add")) {
                // Adds the amount of liquid specified to the first container (can not exceed capacity)
                firstContainer += amount;
                if (firstContainer > capacity) {
                    firstContainer = capacity;
                }
            }

            if (command.equals("move")) {
                // Moves the amount of liquid specified from the first container to the second container
                if (amount < firstContainer) {
                    secondContainer += amount;
                    firstContainer -= amount;
                } else if (amount >= firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }
                if (secondContainer > capacity) {
                    // Ensure that the liquid in the second container does not exceed the capacity
                    secondContainer = capacity;
                }
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
                if (firstContainer < 0) {
                    firstContainer = 0;
                }
            }

            if (command.equals("remove")) {
                // Removes the amount of liquid specified from the second container
                if (amount >= secondContainer) {
                    secondContainer -= secondContainer;
                } else {
                    secondContainer -= amount;
                }
            }


        }
    }
}