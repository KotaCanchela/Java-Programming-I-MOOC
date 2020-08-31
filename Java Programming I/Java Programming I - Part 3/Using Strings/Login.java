// Write a program that recognizes the following users:
//
//  username	password
//  alex	sunshine
//  emma	haskell
// The program either shows a personal message or informs of an incorrect username or password.
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        if (user.equals("alex") && pass.equals("sunshine")) {
            System.out.print("You have successfully logged in!");
        } else if (user.equals("emma") && pass.equals("haskell")) {
            System.out.print("You have successfully logged in!");
        } else {
            System.out.print("Incorrect username or password!");
        }
    }
}
