import java.util.Scanner;
import java.util.ArrayList;

public class TelevisionProgramTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        // Implement a program that begins by reading television programs from the user.
        // When the user inputs an empty string as the name of the program, the program stops reading programs.
        while (true) {
            System.out.print("Name: ");
            String programName = scan.nextLine();
            if (programName.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scan.nextLine());

            programs.add(new TelevisionProgram(programName, programDuration));
        }
        // List all programs that are smaller or equal to the duration of the user's input.
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scan.nextLine());

        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }


    }

}
