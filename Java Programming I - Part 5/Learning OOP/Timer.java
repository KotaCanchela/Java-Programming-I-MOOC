// Implement a Timer class based on the material's Clock class


public class Timer {
    private int hSeconds;
    private int seconds;


    public Timer() {
        // Creates a new timer.
        this.hSeconds = 0;
        this.seconds = 0;

    }

    public void advance() {
        // moves the timer forward by a hundredth of a second.
        if (this.hSeconds < 100) {
            this.hSeconds++;
        }
        if (this.hSeconds == 100 && this.seconds < 60) {
            this.seconds++;
            this.hSeconds = 0;
        }
        if (this.seconds == 60) {
            this.seconds = 0;
        }

    }


    public String toString() {
        if (this.seconds < 10 && this.hSeconds < 10) {
            return "0" + this.seconds + ":" + "0" + this.hSeconds;
        } else if (this.seconds < 10 && this.hSeconds >= 10) {
            return "0" + this.seconds + ":" + this.hSeconds;
        } else if (this.seconds > 10 && this.hSeconds < 10) {
            return this.seconds + ":" + "0" + this.hSeconds;
        }
        return this.seconds + ":" + this.hSeconds;
    }
}

