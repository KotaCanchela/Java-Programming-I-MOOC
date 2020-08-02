import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give speed:");

        int value = Integer.valueOf(scan.nextLine());

        if (value > 120) {
            System.out.println("Speeding ticket!");
        }
    }

}