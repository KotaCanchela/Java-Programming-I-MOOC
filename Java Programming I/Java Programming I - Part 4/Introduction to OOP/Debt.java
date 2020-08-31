public class Debt {
    // Declare double-typed instance variables
    private double balance;
    private double interestRate;

    // pass instance variables to the constructor
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        // Prints the current balance
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        // Grows the debt amount.
        this.balance = this.interestRate * this.balance;
    }
}
