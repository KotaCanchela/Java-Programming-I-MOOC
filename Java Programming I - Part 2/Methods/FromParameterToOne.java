
// Create the following method in the exercise template: public static void printFromNumberToOne(int number).
// It should print the numbers from the number passed as a parameter down to one. Two examples of the method's usage are given below.

// public static void main(String[] args) {
//    printFromNumberToOne(5);
// }
public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int numberOfTimes) {
        while (numberOfTimes > 0) {
            // Loop ends once numberofTimes is equal to 0
            System.out.println(numberOfTimes);
            numberOfTimes--;
            // numberOfTimes decreasing by 1 and printing number each loop
        }

    }
}
