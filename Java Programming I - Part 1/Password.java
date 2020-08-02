import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");

        String passwordInput = scan.nextLine();
        String password = "Caput Draconis";
        if (passwordInput.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
    
}