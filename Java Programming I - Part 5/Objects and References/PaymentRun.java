public class PaymentRun {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        PaymentCard card = new PaymentCard(250);

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remanining change: " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change: " + change);

        change = unicafeExactum.eatHeartily(4.3);

        System.out.println("remaining change: " + change);

        System.out.println(unicafeExactum);

        unicafeExactum.eatHeartily(card);
        System.out.println(card.balance());
        System.out.println(unicafeExactum);

        unicafeExactum.addMoneyToCard(card, 50);

        System.out.println(card.balance());

        System.out.println(unicafeExactum);
    }
}
