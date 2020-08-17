
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMeal = 2.50;
        double change = payment - affordableMeal;
        if (change < 0) {
            return payment;
        }
        this.money += affordableMeal;
        affordableMeals++;
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
        // If payment card has enough money, balance of card is decreased by price and the method returns true
        double affordableMeal = 2.50;
        if (card.balance() >= affordableMeal) {
            card.takeMoney(affordableMeal);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartyMeal = 4.30;
        double change = payment - heartyMeal;
        if (change < 0) {
            return payment;
        }
        this.money += heartyMeal;
        heartyMeals++;
        return change;
    }


    public boolean eatHeartily(PaymentCard card) {
        // If payment card has enough money, balance of card is decreased by price and the method returns true
        double heartyMeal = 4.30;
        if (card.balance() >= heartyMeal) {
            card.takeMoney(heartyMeal);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        // Adds money to card
        if (this.money >= sum) {
            if (sum > 0) {
                card.addMoney(sum);
                this.money += sum;
            }
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
