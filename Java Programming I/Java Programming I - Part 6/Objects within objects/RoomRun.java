import java.util.Scanner;

public class RoomRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Room room = new Room();

        System.out.println("Empty room? " + room.isEmpty());

        while (true) {
            System.out.println("Add a name for the person (empty to break)");
            String name = scan.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Add the height of the person");
            int height = Integer.valueOf(scan.nextLine());

            room.add(new Person(name, height));
        }
        System.out.println("Empty room? " + room.isEmpty());
        System.out.println("------");

        for (Person person: room.getPersons()) {
            System.out.println(person);
        }

        System.out.println("Shortest: " + room.shortest());

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
