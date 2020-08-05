
import java.util.ArrayList;
import java.util.Scanner;
// Modify the program so that instead of the first value, the program prints the sum of the
// second and third numbers. The program is allowed to malfunction if there are fewer than three
// entries on the list, so you don't need to prepare for such an event at all.
public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }

            numbers.add(number);
        }
        int sum = numbers.get(1) + numbers.get(2);
        System.out.println(sum);
    }
}
