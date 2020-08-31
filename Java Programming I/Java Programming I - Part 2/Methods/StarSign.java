public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
// PART 1: PRINTING STARS
// Define a method called printStars that prints the given number of stars and a line break.

    public static void printStars(int number) {
        for (int num = 0; num < number; num++) {
            System.out.print("*");
        }
        System.out.println("");
    }

// PART 2: PRINTING A SQUARE
// Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method.
// ****
// ****
// ****
// ****
    public static void printSquare(int size) {
        for (int start = 0; start < size; start++) {
            printStars(size);
        }
    }

// PART 3: PRINTING A RECTANGLE
// Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the
// printStars method. So the method call printRectangle(17, 3) should produce the following output:
// *****************
// *****************
// *****************

    public static void printRectangle(int width, int height) {
        for (int start = 0; start < height; start++) {
            printStars(width);
        }
    }
// PART 4: PRINTING A TRIANGLE
// Create a method called printTriangle(int size) that prints a triangle by using the printStars method.
// So the call printTriangle(4) should print the following:
// *
// **
// ***
// ****
    public static void printTriangle(int size) {
        for (int start = 0; start <= size; start++) {
            printStars(start);
        }
    }
}
