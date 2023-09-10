class Account {
    String name, type;
    int accNo;
    double balance;

    Account(String name, int accNo, String type, double bal) {
        this.name = name;
        this.accNo = accNo;
        this.type = type;
        balance = bal;
    }

    void display() {
        System.out.println("Account balance: " + balance);
    }

    void deposit(double dep) {
        balance += dep;
        System.out.printf("Deposit of %.2f successful!\n", dep);
        display();
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            System.out.println("You withdrew " + amount);
            balance -= amount;
        } else
            System.out.println("Sorry. Not enough balance.");
        display();
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String name, int acc, double bal) {
        super(name, acc, "current account", bal);
    }

    void deposit(double dep) {
        super.deposit(dep);
        display();
    }

    void withdraw(double amount) {
        if (amount <= balance)
            super.withdraw(amount);
        else
            System.out.println("Not enough balance");
        display();
    }

    void display() {
        super.display();
    }
}

class SavingsAccount extends Account {
    double interest = 0.07;
    double minBal = 10000;
    double serviceTaxRate = 0.05;

    SavingsAccount(String name, int acc, double bal) {
        super(name, acc, "savings account", bal);
    }

    void interest() {
        double interestAmount = interest * balance;
        System.out.printf("Interest on %.2f is %.2f\n", balance, interestAmount);
        balance += interestAmount;
    }

    void deposit(double dep) {
        super.deposit(dep);
    }

    void withdraw(double amount) {
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
        display();
    }

    void display() {
        super.display();
    }

}

class Q1 {
    public static void main(String[] args) {
        CurrentAccount acc1 = new CurrentAccount("Rushil", 22020202, 10000);
        acc1.withdraw(1000);
        SavingsAccount acc2 = new SavingsAccount("arhaan", 2232323, 9000);
        acc2.display();
        acc2.deposit(5000);
        acc2.withdraw(15000);
    }
}