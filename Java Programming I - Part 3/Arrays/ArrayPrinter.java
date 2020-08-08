// Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter' to make
// it print the numbers of the array it receives more neatly. There should be a whitespace and
// a comma between each number. don't put a comma after the last number.
// Print the numbers on one line using System.out.print.


public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int num = 0;
        while (num < array.length) {
            if (num == array.length - 1) {
                System.out.print(array[num]);
            } else if (num < array.length) {
                System.out.print(array[num] + ", ");
            }
            num++;
        }
    }
}
