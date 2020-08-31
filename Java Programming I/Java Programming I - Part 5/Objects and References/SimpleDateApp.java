
public class SimpleDateApp {

    private int day;
    private int month;
    private int year;

    public SimpleDateApp(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDateApp compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        // Moves the day forward by one day
        if (this.day < 30) {
            this.day++;
        } else if (this.day == 30 && this.month <= 11) {
            this.month++;
            this.day = 1;
        } else if (this.day == 30 & this.month == 12) {
            this.day = 1;
            this.month = 1;
            this.year++;
        }
    }

    public void advance(int howManyDays) {
        // Moves the day forward by the number of days given.
        int counter = 0;
        while (howManyDays > counter) {
            counter++;
            advance();
        }
    }

    public SimpleDateApp afterNumberOfDays(int days) {
        SimpleDateApp newDate = new SimpleDateApp(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
