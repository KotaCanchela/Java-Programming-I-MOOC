import java.util.Scanner;

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
            // Cube the number and print it
            int cubed = numCube * numCube * numCube;
            System.out.println(cubed);

        }
    }
}
