class Time {
    private int hr;
    private int min;
    private int s;

    // Constructor to initialize time to zero
    public Time() {
        this.hr = 0;
        this.min = 0;
        this.s = 0;
    }

    // Constructor to initialize time to a fixed value
    public Time(int hours, int minutes, int seconds) {
        hr = hours;
        min = minutes;
        s = seconds;
    }

    // Method to display time in hh:mm:ss format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, s);
    }

    // Method to add two Time objects and return a new Time object
    public Time addTime(Time otherTime) {
        int newHours = this.hr + otherTime.hr;
        int newMinutes = this.min + otherTime.min;
        int newSeconds = this.s + otherTime.s;

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
}

class Q3 {
    public static void main(String[] args) {
        Time time1 = new Time(3, 45, 23); // Initialize to zero
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
