public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        // Calculates and turns the target heart rate as a percentage of maximum heart rate
        Double maximumHeartRate =  206.3 - (0.711 * this.age); // Formula for maximum heart rate
        return (maximumHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
}
