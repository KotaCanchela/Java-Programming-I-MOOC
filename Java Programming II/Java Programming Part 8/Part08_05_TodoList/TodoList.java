import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        // Adds the task passed as a parameter to the to do list
        this.list.add(task);
    }

    public void print() {
        // Prints the exercises in the to do list each with a number associated to the task
        int index = 1;
        if (this.list.isEmpty()) {
            // Returns nothing if the list is empty.
            return;
        }
        for (String task: this.list) {
            System.out.println(index + ": " + task);
            index++;
        }
    }

    public void remove(int number) {
        // Removes the task associated with the given task number that can be seen in print
        this.list.remove(number - 1);
    }
}
