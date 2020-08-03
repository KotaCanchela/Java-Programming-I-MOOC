import java.util.Scanner;
// Write a program which prints the integers from 1 to a number given by the user.
// Ask the user for the starting point as well.
public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where to?");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Where from?");
        for (int num = Integer.valueOf(scan.nextLine()); num <= number; num++) {
            System.out.println(num);
        }
    }
}
