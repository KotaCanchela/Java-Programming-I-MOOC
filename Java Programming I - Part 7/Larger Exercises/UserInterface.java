import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private Grades grades;

    public UserInterface(Scanner scan, Grades grades) {
        this.scan = scan;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops;");
        while (true) {
            int point = Integer.valueOf(scan.nextLine());
            if (point == -1) {
                break;
            }
            grades.add(point);
        }
        System.out.println(grades);
    }
}
