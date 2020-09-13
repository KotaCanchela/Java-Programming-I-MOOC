import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // Adds the translation for the word and preserves the old translations

        // Empty list added for new word if not already added
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        // Adds translation
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        // Returns a list of the translations added for the word. If the word has no translations, the method
        // returns an empty list

        if (this.dictionary.get(word) == null) {
            return new ArrayList<>();
        }
        return this.dictionary.get(word);
    }

    public void remove(String word) {
        // Removes the word and all its translations from the dictionary.
        this.dictionary.remove(word);
    }
}
