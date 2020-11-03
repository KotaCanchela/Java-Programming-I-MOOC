public class ColorPoint extends Point {
    private String colour;

    public ColorPoint(int x, int y, String colour) {
        super(x, y);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + " colour: " + colour;
    }

}
