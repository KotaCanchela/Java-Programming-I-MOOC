import java.util.HashMap;

public class BookRun {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and sensibility", 1811, "test contents test contents"));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "more test contents"));

        printValues(hashmap);
        System.out.println("----");
        printValueIfNameContains(hashmap, "preju");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        // Prints all the values in the hashmap given as a parameter using the toString method of the book object
        System.out.println(hashmap.values());
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        // Prints only the books in the given hashmap which name contains the string.
        for (Book value: hashmap.values()) {
            if (value.getName().contains(text)) {
                System.out.println(value);
            }
        }
    }


}
