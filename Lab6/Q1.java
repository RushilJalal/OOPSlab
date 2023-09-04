class Account
{
    String name, type;
    int accNo, balance;
    float interest;

    Account(String name, int acc, String type, int bal)
    {
        this.name = name;
        accNo = acc;
        this.type = type;
        balance = bal;
    }
    void calculate()
    {    
        balance += balance*interest; 
    }

    void display()
    {
        System.out.println("Current balance: "+ balance);
    }

    void deposit(int dep)
    {
        balance += dep;
        System.out.printf("Deposit of %d successful!",dep);
        display();
    }


    
} 

class currentAccount extends Account
{
    int minBal = 10000;
    float serviceTax = 0.01;
    if (balance < minBal)
    {
        balance -= serviceTax*balance; 
    }
    interest = 0;
}

class Q1
{
    public static void main(String[] args) {
        
    }
}