import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int square = Integer.valueOf(scan.nextLine());
        int squared = square * square;
        System.out.println(squared);
    }
}