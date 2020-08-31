public class DebtTest {
    public static void main(String[] args) {

        Debt mortgage = new Debt(100000, 1.02);

        // Print mortgage balance
        mortgage.printBalance();

        // Grows interest rate on mortgage balance by one year and prints the new balance.
        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        // Grow interest rate by an additional 20 years
        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }

        mortgage.printBalance();
    }
}
