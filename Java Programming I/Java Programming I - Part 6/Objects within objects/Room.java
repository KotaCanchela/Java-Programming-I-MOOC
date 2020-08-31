import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        // Adds the person as a parameter to the list
        this.room.add(person);
    }

    public boolean isEmpty() {
        // Returns a boolean-type true or false that tells whether the room is empty or not
        return this.room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        // Returns a list of the persons in the room
        return this.room;
    }

    public Person shortest() {
        // Returns the shortest person in the room
        if (this.room.isEmpty()) {
            return null;
        }

        Person person = this.room.get(0);

        for (Person people: this.room) {
            if (people.getHeight() < person.getHeight()) {
                person = people;
            }
        }

        return person;
    }

    public Person take() {
        // Removes the shortest person in the room
        if (this.room.isEmpty()) {
            return null;
        }

        Person shortest = shortest();
        this.room.remove(shortest);
        return shortest;
    }
}
