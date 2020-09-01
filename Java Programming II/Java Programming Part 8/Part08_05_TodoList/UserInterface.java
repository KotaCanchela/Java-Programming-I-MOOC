import java.util.Scanner;


public class UserInterface {
    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            // UI for the TodoList class
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                // Breaks out of the start() method
                break;
            }

            if (command.equals("add")) {
                // Prompts user to add an exercise to the todolist then adds what the user inputs
                System.out.print("To add: ");
                String addExercise = scan.nextLine();
                this.list.add(addExercise);
            }

            if (command.equals("list")) {
                // Prints all exercises in the todo list
                this.list.print();
            }

            if (command.equals("remove")) {
                // Prompts the user to select an exercise to be removed from the todo list
                System.out.print("Which one is removed? ");
                int removeIndex = Integer.valueOf(scan.nextLine());
                this.list.remove(removeIndex);
            }
        }
    }

}
