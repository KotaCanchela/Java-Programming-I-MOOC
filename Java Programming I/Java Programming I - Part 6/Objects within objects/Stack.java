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
        return this.stack;
    }

    public String take() {
        // Returns the top most value (last value added) and removes it from the stack
        int lastValue = this.stack.size() - 1;
        return this.stack.remove(lastValue);
    }
}

