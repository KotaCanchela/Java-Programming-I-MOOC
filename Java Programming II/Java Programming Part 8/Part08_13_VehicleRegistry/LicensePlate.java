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

}

