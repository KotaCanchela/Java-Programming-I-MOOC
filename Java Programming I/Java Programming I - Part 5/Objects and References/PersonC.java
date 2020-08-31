
public class PersonC {

    private String name;
    private Pet pet;

    public PersonC(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public PersonC(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public PersonC() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
        return this.name + ", has a friend called " + pet.getName() + "(" + pet.getBreed() + ")";
    }

}
