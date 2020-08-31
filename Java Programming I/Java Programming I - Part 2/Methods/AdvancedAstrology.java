public class AdvancedAstrology {

    public static void printStars(int number) {
        int beginning = 0;

        while (beginning < number) {
            System.out.print("*");
            beginning++;
        }
        System.out.println("");
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        int beginning = 0;

        while (beginning < number) {
            System.out.print(" ");
            beginning++;
        }

        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int i = 1;

        while (i <= size) {
            printSpaces(size - i);
            printStars(i);

            i++;

        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int h = 1;
        int j = 1;

        while (i <= height) {

            printSpaces(height - i);
            printStars(h);

            i++;// part 3 of the exercise
            h = h + 2;

        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
