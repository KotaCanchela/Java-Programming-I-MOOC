import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            // Prompt user input for an integer
            int num = Integer.valueOf(scan.nextLine());

            // 0 to break
            if (num == 0) {
                break;
            }

            // Add all positive integers to the sum variable
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        if (sum == 0) {
            // Print statement if no positive integers were added
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum / count;
            System.out.println(average);
        }
    }
}
