public class Cube {
    // Cube class to represent a cube
    private int edgeLength;
    private int volume;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
        this.volume = this.edgeLength * this.edgeLength * this.edgeLength;
    }

    public int volume() {
        // Returns the cube's volume
        return this.volume;
    }

    public String toString() {
        // Returns the edge length and volume of the cube
        return "The length of the edge is " + this.edgeLength + " and the volume    " + this.volume;
    }
}
