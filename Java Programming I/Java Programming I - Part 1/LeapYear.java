import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int value = Integer.valueOf(scan.nextLine());

        if (value % 400 == 0 && value % 100 == 0) {
            System.out.println("This year is a leap year.");
        } else if (value % 4 == 0 && !(value % 100 == 0)) {
            System.out.println("This value is a leap year.");
        } else {
            System.out.println("This value is not a leap year.");
        }
    }
}