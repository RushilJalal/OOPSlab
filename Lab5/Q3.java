class Time {
    int hr, min, s;

    Time() {
        hr = min = s = 0;
    }

    Time(int hr, int min, int s) {
        this.hr = hr;
        this.min = min;
        this.s = s;
    }

    void display() {
        System.out.printf("%d:%d:%d", hr, min, s);
    }

    void add(Time t1, Time t2) {
        // add this
    }
}

class Q3 {
    public static void main(String[] args) {
        Time t1 = new Time(5, 5, 23);
        Time t2 = new Time(2, 8, 34);
        t1.display();
        t2.display();
    }
}