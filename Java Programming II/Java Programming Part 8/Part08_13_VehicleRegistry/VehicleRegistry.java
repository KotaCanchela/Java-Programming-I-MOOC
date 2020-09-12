import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleReg;

    public VehicleRegistry() {
        this.vehicleReg = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        // Assigns the owner it received as a parameter to a car that corresponds to the license plate received as a
        // parameter. If the license plate doesn't have an owner, the method returns true. If the license plate
        // already has an owner attached, the method returns false and does nothing
        if (this.vehicleReg.containsKey(licensePlate)) {
            return false;
        }

        this.vehicleReg.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        // Returns the owner of the car corresponding to the license plate received as a parameter.
        // If the car isn't in the registry, the method returns null
        return this.vehicleReg.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        // Removes the license plate and attached data from the registry. The method returns true if removed successfully.
        if (!(this.vehicleReg.containsKey(licensePlate))) {
            return false;
        }

        this.vehicleReg.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        // Prints the license plates in the registry
        for (LicensePlate license: this.vehicleReg.keySet()) {
            System.out.println(license);
        }
    }

    public void printOwners() {
        // Prints the owners of the cars in the registry. Each name should only be printed once
        ArrayList<String> owners = new ArrayList<>();
        for (String name: this.vehicleReg.values()) {
            if (!(owners.contains(name))) {
                owners.add(name);
            }
        }
        for (String name: owners) {
            System.out.println(name);
        }
    }
}
