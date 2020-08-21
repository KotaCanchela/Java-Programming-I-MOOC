import java.util.Scanner;
public class UserInterfaceToDoList {
    private TodoList list;
    private Scanner scan;

    public UserInterfaceToDoList(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            // Prompt user for a command
            System.out.print("Command: ");
            String command = scan.nextLine();
            // If command is stop then it breaks out of the loop
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                // Ask user for task to be added then it is added to the to do list
                System.out.print("To add: ");
                String add = scan.nextLine();
                this.list.add(add);
            }

            if (command.equals("list")) {
                // Prints all tasks on the to do list
                this.list.print();
            }

            if (command.equals("remove")) {
                // Asks the user the id of the task to be removed,then it is removed from the list
                System.out.print("Which one is removed? ");
                int removeTask = Integer.valueOf(scan.nextLine());
                this.list.remove(removeTask);
            }
        }
    }
}
