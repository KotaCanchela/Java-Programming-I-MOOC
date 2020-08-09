// Write a program that:
    // Creates an account named "Matthews account" with the balance 1000
    // Creates an account named "My account" with the balance 0
    // Withdraws 100.0 from Matthew's account
    // Deposits 100.0 to "my account"
    // Prints both the accounts
public class YourFirstBankTransfer {
    public static void main(String[] args) {
        // Account creation
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);

        // Withdraw 100.0 from Matthew's account.
        matthewsAccount.withdrawal(100);

        // Deposits 100.0 to "my account"
        myAccount.deposit(100);

        // Prints both accounts
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
