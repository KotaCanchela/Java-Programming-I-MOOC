import java.util.Arrays;
public class Sorting {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 3, 1, 5, 99, 3, 12};

        System.out.println("Smallest: " + Sorting.smallest(array));
        System.out.println("Index of the smallest number: " + Sorting.indexOfSmallest(array));
        System.out.println(Sorting.indexOfSmallestFrom(array, 0));
        Sorting.sort(array);
    }

    public static int smallest(int[] array) {
        // Returns the smallest int in an array
        int num = array[0];
        for (int number: array) {
            if (number < num) {
                num = number;
            }
        }
        return num;
    }

    public static int indexOfSmallest(int[] array) {
        // Returns the index of the smallest int in the array
        int smallest = Sorting.smallest(array);
        int counter = 0;
        int indexOfArray = 0;
        for (int num: array) {
            if (smallest == num) {
                indexOfArray = counter;
            }
            counter++;

        }
        return indexOfArray;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // Searches for the index of the smallest number from a specific position in the array
        int smallest = table[startIndex];
        int counter = startIndex;
        int index = 0;
        while (table.length > counter) {
            // Find the smallest number from the index
            if (table[counter] < smallest) {
                smallest = table[counter];
            }
            counter++;
        }

        int count = 0;
        while (count < table.length) {
            if (table[count] == smallest) {
                index = count;
            }
            count++;
        }
        return index;

    }

    public static void swap(int[] array, int index1, int index2) {
        // Swap two indexes in the array
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        // Sort the array by smallest to largest number
        int counter = 0;
        int smallest = array[0];
        for (int num: array) {
            smallest = Sorting.indexOfSmallestFrom(array, counter);
            Sorting.swap(array, smallest, counter);
            counter++;
        }
        System.out.println(Arrays.toString(array));
    }
}
