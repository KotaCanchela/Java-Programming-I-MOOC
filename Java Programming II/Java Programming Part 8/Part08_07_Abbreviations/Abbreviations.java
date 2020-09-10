import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> hash;

    public Abbreviations() {
        this.hash = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        // Adds a new abbreviation and its explanation
        this.hash.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        // Checks to see if an abbreviation has already been added
        return this.hash.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        // Finds the explanation for an abbreviation. Returns null if the abbreviation hasn't been added yet
        String name = this.hash.get(abbreviation);

        if (name == null) {
            return null;
        }

        return this.hash.get(abbreviation);
    }
}



