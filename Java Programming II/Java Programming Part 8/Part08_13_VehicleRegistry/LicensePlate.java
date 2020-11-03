import java.util.Objects;


public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object object) {
        // If the variables are in the same place, they are the same.
        if (this == object) {
            return true;
        }

        // If the variable is not of LicensePlate type then return false
        if (!(object instanceof LicensePlate)) {
            return true;
        }

        // Convert object to LicensePlate type
        LicensePlate newObject = (LicensePlate) object;

        // If the instance variables are the same, then so are the objects
        return this.liNumber.equals(newObject.liNumber) && this.country.equals(newObject.country);
    }

    public int hashCode() {
        return this.liNumber.hashCode() + this.country.hashCode() * 8;
    }

}

