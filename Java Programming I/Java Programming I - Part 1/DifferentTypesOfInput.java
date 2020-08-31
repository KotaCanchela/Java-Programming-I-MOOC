import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String firstString = scan.nextLine();

        System.out.println("Give an integer:");
        int firstInteger = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double firstDouble = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean firstBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + firstString);
        System.out.println("You gave the integer " + firstInteger);
        System.out.println("You gave the double " + firstDouble);
        System.out.println("You gave the boolean " + firstBoolean);
    }
}