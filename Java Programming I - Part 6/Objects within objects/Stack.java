import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        // Checks to see if the Arraylist stack is empty
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        // Adds the value to the arraylist Stack
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        // Returns the values contained in the stack as a list
        for (String value: this.stack) {
            System.out.println(value);
        }
    }
}

