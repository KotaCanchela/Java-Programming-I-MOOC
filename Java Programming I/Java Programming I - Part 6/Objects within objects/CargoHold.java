public class CargoHold {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        System.out.println("----");

        System.out.println("The suitcase contains all of the following items:");
        suitcase.printItems();

        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        // Prints out heaviest item

        System.out.println("Heaviest item: " + suitcase.heaviestItem());

        System.out.println("------");

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);

        hold.printItems();

    }
}
