import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TodoList list = new TodoList();

        UserInterface ui = new UserInterface(list, scan);
        ui.start();
    }
}
