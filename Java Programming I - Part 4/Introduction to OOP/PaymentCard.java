
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // Reduce the card's balance by 2.60 euros.
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // Reduce the card's balance by 4.60 euros
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        if (this.balance >= 150.0) {
            this.balance = 150.0;
        }

    }

}
