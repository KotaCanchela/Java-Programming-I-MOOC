
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String word = "elements";
        // Form a string for the elements in the list
        String output = "";
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            if (this.elements.size() == 1) {
                word = "element";
            }
            output = "The collection " + this.name + " has " + this.elements.size() + " " + word + ":";
            for (String element: elements) {
                output = output + "\n" + element;
            }
            return output;
        }
    }
}
