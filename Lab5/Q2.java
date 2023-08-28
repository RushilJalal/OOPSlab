class Employee
{
    String name, city;
    double basic, DA, HR, total;

    void getdata(String name, String city, double basic, double DA, double HR)
    {
        this.name = name;
        this.city = city;
        this.basic = basic;
        this.DA = DA;
        this.HR = HR;
    }

    void calculate()
    {
        total = (basic + basic * DA / 100) + (basic * HR / 100);
    }

    void display()
    {
        System.out.println("Total salary: "+ total);
    }

}

class Q2
{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getdata("anil", "mumbai", 10000, 0.05, 0.1);
        e.calculate();
        e.display();
    }
}