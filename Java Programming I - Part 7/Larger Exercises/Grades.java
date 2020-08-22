import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;

    public Grades() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        // Adds points to the point total
        if (point >= 0 && point <=100) {
            this.points.add(point);
        }
    }

    public double averagePoints() {
        // Average of points in the point list
        int count = 0;
        int sum = 0;
        if (this.points.isEmpty()) {
            return -1;
        }
        for (int num: this.points) {
            count++;
            sum += num;
        }

        double average = (double) sum / count;

        return average;
    }

    public double averagePassingGrade() {
        // Average of grades that were at minimum score of 50
        int count = 0;
        int sum = 0;
        if (this.points.isEmpty()) {
            return -1;
        }

        for (int num: this.points) {
            if (num >= 50) {
                count++;
                sum += num;
            }
        }

        double average = (double) sum / count;
        return average;
    }

    public double passPercentage() {
        // Percentage of passing grades (minimum score of 50)
        int total = 0;
        int count = 0;

        if (this.points.isEmpty()) {
            return 0;
        }

        for (int num: this.points) {
            total++;
            if (num >= 50) {
                count++;
            }
        }

        double passPercentage =  100.0 * count / total ;

        return passPercentage;
    }

    public String gradeDistribution() {
        // Returns the grade to the attributed score with a * for each score that received this grade
        String five = 5 + ": ";
        String four = 4 + ": ";
        String three = 3 + ": ";
        String two = 2 + ": ";
        String one = 1 + ": ";
        String zero = 0 + ": ";

        for (int num: this.points) {
            if (num < 50) {
                zero += "*";
            } else if (num < 60) {
                one += "*";
            } else if (num < 70) {
                two += "*";
            } else if (num < 80) {
                three += "*";
            } else if (num < 90) {
                four += "*";
            } else {
                five += "*";
            }
        }

        return "\nGrade distribution:\n" + five + "\n" + four + "\n" + three + "\n" + two + "\n" + one + "\n" + zero;

    }

    public String toString() {
        double passingGrade = this.averagePassingGrade();
        if (passingGrade == -1) {
            return "Point average (all): " + averagePoints() +"\nPoint average (passing): -"
                    +"\nPass percentage: " + passPercentage() + gradeDistribution();
        }
        return "Point average (all): " + averagePoints() +"\nPoint average (passing): " + passingGrade +"\n" +
                "\nPass percentage: " + passPercentage() + gradeDistribution();
    }




}
