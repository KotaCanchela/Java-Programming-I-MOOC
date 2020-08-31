
public class HealthStation {

    private int weighCount;

    public HealthStation() {
        this.weighCount = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        // Increases the weight of the person in the Person class by 1
        person.setWeight(person.getWeight() + 1) ;
    }

    public int weighings() {
        // Returns the amount fo weighings done
        return this.weighCount;
    }

}
