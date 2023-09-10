class Account {
    String name, type;
    int accNo;
    double balance;

    Account(String name, int acc, String type, double bal) {
        this.name = name;
        accNo = acc;
        this.type = type;
        balance = bal;
    }

    void display() {
        System.out.println("Account balance: " + balance);
    }

    void deposit(double dep) {
        balance += dep;
        System.out.printf("Deposit of %d successful!", dep);
        display();
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("You withdrew " + amount);
            balance -= amount;
        } else
            System.out.println("Sorry. Not enough balance.");
    }
}

class currentAccount extends Account {

    currentAccount(String name, int acc, String type, double bal) {
        super(name, acc, "current account", bal);
    }

    void deposit(double dep) {
        super.deposit(dep);
    }

    void withdraw(double amount) {
        super.withdraw(amount);
    }

    void display() {
        super.display();
    }

}

class SavingsAccount extends Account {
    double minBal;
    double serviceTaxRate;
    double interest = 0.07;

    SavingsAccount(String name, int acc, String type, double bal, double minBal, double serviceTax) {
        super(name, acc, "Savings account", bal);
        this.minBal = minBal;
        this.serviceTax = serviceTax;
    }

    void interest() {
        balance += interest * balance;
    }

    void withdraw() {
        if (balance >= minBal)
            super.withdraw(amount);
        else {
            System.out.println("Not enough balance");
            serviceTax();
        }
    }

    void serviceTax() {

        double serviceTax = (minBal - balance) * serviceTaxRate;
        System.out.println("Penalty of " + serviceTax);
        balance -= serviceTax;
    }

    void display() {
        super.display();
    }

}

class Q1 {
    public static void main(String[] args) {

    }
}