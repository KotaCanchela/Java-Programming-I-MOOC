import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Gathers data for the book object
        System.out.println("What is the name of the book?");
        String name = scan.nextLine();

        System.out.println("Who is the author of the book?");
        String author = scan.nextLine();

        System.out.println("How many pages are in the book?");
        int pages = Integer.valueOf(scan.nextLine());

        // Creates book
        Book book = new Book(author, name, pages);

        System.out.println(book.getName());

        System.out.println(book);
    }
}
