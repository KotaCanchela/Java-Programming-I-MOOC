public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        // Constructor for the class Book
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        // Returns the author's name of the book.
        return this.author;
    }

    public String getName() {
        // Returns the name of the book.
        return this.name;
    }

    public int getPages() {
        // Returns the number of pages in the book.
        return this.pages;
    }

    public String toString() {
        // Prints the book object in a neatly formatted sentence.
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}
