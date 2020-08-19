import java.util.ArrayList;
import java.util.Scanner;

public class BookRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<BookSecond> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scan.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scan.nextLine());
            BookSecond book = new BookSecond(name, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }
        }

        System.out.println("Thank you! Books added: " + books.size());
    }
}
