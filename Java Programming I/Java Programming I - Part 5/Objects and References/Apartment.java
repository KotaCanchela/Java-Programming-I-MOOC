public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        // Returns true if the apartment whose method is called has a larger total area than the compared object.
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        // Returns the price difference of the apartment whose method was called and the apartment object received as parameter
        return Math.abs((this.squares * this.pricePerSquare) - (compared.squares * compared.pricePerSquare));
    }

    public boolean moreExpensiveThan(Apartment compared) {
        // Returns true if the apartment whose method is called is more expensive than the apartment
        // object received as a parameter
        if ((this.squares * this.pricePerSquare) > (compared.squares * compared.pricePerSquare)) {
            return true;
        }
        return false;
    }

}
