class Bank {
    double bal;
    double interest;
    int rate;

    Bank(double bal) {
        this.bal = bal;
        this.rate = 0; // Initialize rate
    }

    int getRateOfInterest(int rate) {
        this.rate = rate;
        return this.rate;
    }

    double calculate() {
        interest = bal * (rate / 100.0); // Make sure to use 100.0 to get a double result
        return interest;
    }
}

class SBI extends Bank {
    SBI(double bal) {
        super(bal);
    }

    @Override
    int getRateOfInterest(int rate) {
        super.getRateOfInterest(rate);
        return rate;
    }

    @Override
    double calculate() {
        super.calculate();
        return interest;
    }
}

class ICICI extends Bank {
    ICICI(double bal) {
        super(bal);
    }

    @Override
    int getRateOfInterest(int rate) {
        super.getRateOfInterest(rate);
        return rate;
    }

    @Override
    double calculate() {
        super.calculate();
        return interest;
    }
}

class AXIS extends Bank {
    AXIS(double bal) {
        super(bal);
    }

    @Override
    int getRateOfInterest(int rate) {
        super.getRateOfInterest(rate);
        return rate;
    }

    @Override
    double calculate() {
        super.calculate();
        return interest;
    }
}

public class Q3 {
    public static void main(String[] args) {
        SBI s = new SBI(10000);
        ICICI i = new ICICI(10000);
        AXIS a = new AXIS(10000);

        Bank ref;
        ref = s;
        ref.getRateOfInterest(7);
        ref = i;
        ref.getRateOfInterest(8);
        ref = a;
        ref.getRateOfInterest(9);
        // Dynamic method dispatch
        System.out.println("SBI Bank Interest: " + sbiBank.calculate());
        System.out.println("ICICI Bank Interest: " + iciciBank.calculate());
        System.out.println("AXIS Bank Interest: " + axisBank.calculate());
    }
}
