import java.util.Scanner;

public class ToDoListRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TodoList list = new TodoList();

        UserInterfaceToDoList newUI = new UserInterfaceToDoList(list, scan);

        newUI.start();
    }


}
