import java.util.Scanner;
import java.lang.Math;

public class Cubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            // Prompt user input for an integer to be cubed
            String num = scan.nextLine();
            if (num.equals("end")) {
                break;
            }
            // if num != end then treat it as an integer
            int numCube = Integer.parseInt(num);
            int cubed = numCube * numCube * numCube;
            System.out.println(cubed);

        }
    }
}
