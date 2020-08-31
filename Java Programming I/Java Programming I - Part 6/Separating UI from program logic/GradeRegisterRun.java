import java.util.Scanner;

public class GradeRegisterRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        GradeRegisterUI ui = new GradeRegisterUI(register, scan);

        ui.start();

    }
}
