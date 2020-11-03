import java.util.ArrayList;

public class PointMain {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new Point(8, 12));
        points.add(new ColorPoint(4, 8, "red"));
        points.add(new ColorPoint(4, 82, "blue"));
        points.add(new Point3D(2, 12, 15));
        points.add(new Point(0, 0));

        for (Point p: points) {
            System.out.println(p);
        }
    }
}
