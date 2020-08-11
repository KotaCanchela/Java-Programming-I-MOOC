public class Book {
    // Initialise attributes for the class book
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Returns name of the book title
    public String getName() {
        return this.title;
    }

    // Returns a neatly formatted sentence with the title, number of pages, and publication year of the book.
    public String toString() {
        return this.title +", " + this.numberOfPages +" pages, " + publicationYear;
    }
}
