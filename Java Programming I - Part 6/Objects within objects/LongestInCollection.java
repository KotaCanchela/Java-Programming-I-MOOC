
import java.util.ArrayList;

public class LongestInCollection {

    private String name;
    private ArrayList<String> elements;

    public LongestInCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        // Returns the longest string of the collection
        if (this.elements.isEmpty()) {
            return null;
        }

        String name = this.elements.get(0);

        for (String names: this.elements) {
            if (names.length() > name.length()) {
                name = names;
            }
        }
        return name;

    }

}
