// Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. NB! Perform all the operations in this exact order.
public class YourFirstAccount{
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);


        artosAccount.deposit(20);
        System.out.println(artosAccount);

    }
}