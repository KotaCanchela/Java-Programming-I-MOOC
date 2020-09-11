import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("thank you", "merci");
        hashmap.put("hi", "salut");
        hashmap.put("hello", "bonjour");
        hashmap.put("i am hungry", "j'ai faim");

        printKeys(hashmap);
        printKeysWhere(hashmap, "ll"); // expected to return "hello"
        printValuesOfKeysWhere(hashmap, "ll"); // expected to return the value of "hello"

    }

    public static void printKeys(HashMap<String, String> hashmap) {
        // Prints all the keys in the hashmap given as a parameter
        System.out.println(hashmap.keySet());
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        // Prints the keys in the hashmap given as a parameter which contain the string given as a parameter
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        // Prints the values in the given hashmap which keys contain the given string
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
