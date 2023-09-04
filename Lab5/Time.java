public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time to zero
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor to initialize time to a fixed value
    public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Method to display time in hh:mm:ss format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    // Method to add two Time objects and return a new Time object
    public Time addTime(Time otherTime) {
        int newHours = this.hours + otherTime.hours;
        int newMinutes = this.minutes + otherTime.minutes;
        int newSeconds = this.seconds + otherTime.seconds;

        // Adjust minutes and seconds if they exceed 59
        if (newSeconds >= 60) {
            newMinutes += newSeconds / 60;
            newSeconds %= 60;
        }
        if (newMinutes >= 60) {
            newHours += newMinutes / 60;
            newMinutes %= 60;
        }
        if (newHours >= 24) {
            newHours %= 24;
        }

        return new Time(newHours, newMinutes, newSeconds);
    }

    // Method to set the time to a specific value
    public void setTime(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time values provided.");
        }
    }

    // Helper method to check if the time values are valid
    private boolean isValidTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 &&
               minutes >= 0 && minutes < 60 &&
               seconds >= 0 && seconds < 60;
    }

    public static void main(String[] args) {
        Time time1 = new Time(); // Initialize to zero
        Time time2 = new Time(12, 30, 45); // Initialize to a fixed value

        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("Time 2:");
        time2.displayTime();

        Time sumTime = time1.addTime(time2);
        System.out.println("Sum of Time 1 and Time 2:");
        sumTime.displayTime();
    }
}
