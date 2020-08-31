
    // Create the following method in the exercise template: public static void printUntilNumber(int number).
    // It should print the numbers from one to the number passed as a parameter.

    // public static void main(String[] args) {
    //    printUntilNumber(5);
    // }

    public class FromOneToParameter {
        public static void main(String[] args) {
            printUntilNumber(5);
        }
        public static void printUntilNumber(int numOfTimes) {
            for (int i = 1; i <= numOfTimes; i++) {
                System.out.println(i);
            }
        }
    }
