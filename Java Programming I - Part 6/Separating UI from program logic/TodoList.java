import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> toDoList;

    public TodoList() {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        // Adds the task passed as a parameter to the ToDoList
        this.toDoList.add(task);
    }

    public void print() {
        // Prints the exercises with a number associated with it on the print statement
        int start = 0;
        for (String exercise: this.toDoList) {
            start++;
            System.out.println(start + ": " + exercise);
        }
    }

    public void remove(int number) {
        // Removes the task associated with the given number
        this.toDoList.remove(number - 1);
    }
}
