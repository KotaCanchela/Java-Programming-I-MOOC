import java.util.Scanner;
// Write a program that reads names and ages from the user until an empty line is entered.
// The name and age are separated by a comma.
// After reading all user input, the program prints the name of the oldest person. You can assume that the user enters
// at least one person, and the that one of the users is older than the others.
public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oldest = -1;
        String name = "";
        while (true) {
            String nameAge = scan.nextLine();
            if (nameAge.equals("")) {
                break;
            }
            String[] pieces = nameAge.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                oldest = age;
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
