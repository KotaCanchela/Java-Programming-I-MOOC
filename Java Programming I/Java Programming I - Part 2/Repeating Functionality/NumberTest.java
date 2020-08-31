public class NumberTest {
    public static void main(String[] args) {
        int number = 0;

        while (true) {
            number = number + 1;
            if (number >= 5) {
                break;
            }

            if (number < 5) {
                continue; // Continue brings the program back to the beginning of the loop. i.e (number = number + 1)
            }
            System.out.print(number + " "); // It seems like this line doesn't even execute.
        }
        System.out.print(number +  " ");
    }
}
