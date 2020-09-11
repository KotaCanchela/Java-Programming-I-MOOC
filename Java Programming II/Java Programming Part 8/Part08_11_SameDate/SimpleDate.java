
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    public boolean equals(Object object) {
        // If the variables are in the same place, they're the same
        if (this == object) {
            return true;
        }

        // If object is not of SimpleDate type, return false
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        // Convert object to SimpleDate type
        SimpleDate newObject = (SimpleDate) object;

        // If the instance variables are the same then so are the objects
        if (this.day == newObject.day && this.month == newObject.month && this.year == newObject.year) {
            return true;
        }
        // Otherwise the objects aren't the same.
        return false;
    }

}
