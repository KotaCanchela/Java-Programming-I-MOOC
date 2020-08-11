import java.util.Scanner;
//
public class Cubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input from user and cube the input. End breaks loop
        while (true) {
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            int inputNum = Integer.valueOf(input);
            System.out.println(Math.pow(inputNum, 3));
        }
    }
}
