import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        // Adds the parameter item to the storage unit that is also given as a parameter

        // Creates new arraylist for the unit if not already created
        this.storage.putIfAbsent(unit, new ArrayList<>());

        // Adds the item to the existing unit.
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        // Returns a list that contains all the items in the storage unit indicated by the parameter
        // If there is no such storage unit or if it contains no items, the method should return an empty list.

        if (this.storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }

        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        // Removes the given item from the given storage unit
        // If the storage unit would be empty after the removal, then the unit is also removed

        this.storage.get(storageUnit).remove(item);

        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        // Returns the name of the storage units as a list
        // Only units that contain items are listed

        ArrayList<String> units = new ArrayList<>();

        for (String name: this.storage.keySet()) {
            if (!(this.storage.get(name) == null)) {
                units.add(name);
            }
        }

        return units;
    }
}
