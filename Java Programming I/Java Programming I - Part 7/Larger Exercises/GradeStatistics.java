import java.util.Scanner;
public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Grades grade = new Grades();

        UserInterface ui = new UserInterface(scan, grade);
        ui.start();
    }
}
