class Account
{
    String name, type;
    int accNo, balance;

    Account(String name, int acc, String type)
    {
        this.name = name;
        accNo = acc;
        this.type = type;
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
    
}