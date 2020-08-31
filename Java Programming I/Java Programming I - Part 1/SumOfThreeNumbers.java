import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scan.nextLine());

        System.out.println("Give the third number:");
        int thirdValue = Integer.valueOf(scan.nextLine());

        System.out.println("The sum of the numbers is " + (firstValue + secondValue + thirdValue));
    }

}