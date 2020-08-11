//  Program that first reads book information from the user.

// Entering an empty string as the name of the book ends the reading process.

//After this the user is asked for what is to be printed. If the user inputs "everything",
// all the details are printed: the book titles, the numbers of pages and the publication years.
// However, if the user enters the string "name", only the book titles are printed.

import java.util.Scanner;
import java.util.ArrayList;
public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> bookInformation = new ArrayList<>();

        while (true) {
            // Ask user for the book title and store it in the string variable bookTitle
            System.out.print("Title: ");
            String bookTitle = scan.nextLine();

            if (bookTitle.isEmpty()) {
                // Empty string for the title of the book breaks the reading process
                break;
            }
            // Ask user for the number of pages and store it in the int variable bookPages
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scan.nextLine());

            // Ask the user for the publication year and store it in the int variable bookYear
            System.out.print("Publication year: ");
            int bookYear = Integer.valueOf(scan.nextLine());

            // Store all of the book information in an arraylist
            bookInformation.add(new Book(bookTitle, bookPages, bookYear));
        }
        // Ask the user what is to be printed, if the user inputs "everything", then all details are printed.
        // However, if the user enters the string "name", only the book titles are printed.
        System.out.print("What information will be printed? ");
        String getInformation = scan.nextLine();

        for (Book bookInfo: bookInformation) {
            if (getInformation.equals("everything")) {
                System.out.println(bookInfo);
            } else if (getInformation.equals("name")) {
                System.out.println(bookInfo.getName());
            }
        }

    }
}
