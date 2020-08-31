import java.util.Scanner;

public class StackRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack stack = new Stack();

        // Check if the stack is empty
        System.out.println(stack.isEmpty());

        while (true) {
            // Add values to the stack
            System.out.println("Add values to the stack (empty to break)");
            String stackAdd = scan.nextLine();
            if (stackAdd.isEmpty()) {
                break;
            }
            stack.add(stackAdd);
        }

        // Check if the stack is empty
        System.out.println(stack.isEmpty());

        // Return the values contained in the stack as a list.
        System.out.println(stack.values());

        // Remove last value in the stack
        stack.take();
        System.out.println(stack.values());

    }
}
