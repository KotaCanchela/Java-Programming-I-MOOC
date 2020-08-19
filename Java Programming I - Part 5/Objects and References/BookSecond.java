public class BookSecond {

    private String name;
    private int publicationYear;

    public BookSecond(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof BookSecond)) {
            return false;
        }

        BookSecond comparedObject = (BookSecond) compared;

        if (this.name.equals(comparedObject.name) && this.publicationYear == comparedObject.publicationYear) {
            return true;
        }
        return false;
    }

}
