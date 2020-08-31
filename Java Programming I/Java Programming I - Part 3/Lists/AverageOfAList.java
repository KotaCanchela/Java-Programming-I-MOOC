
import java.util.ArrayList;
import java.util.Scanner;
// When reading ends, calculate the average of the numbers in it, and then print that value.
public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listAverage = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            if (input == -1) {
                break;
            }
            listAverage.add(input);
        }
        // Declare average and sum variables.
        double average = 0;
        int sum = 0;
        // Add each value in the list to the sum variable then calculate the floating point average
        for (int num: listAverage) {
            sum += num;
            average = (double) sum / listAverage.size();
        }
        System.out.println("Average: " + average);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

    }
}
