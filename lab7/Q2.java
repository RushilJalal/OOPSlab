class Counter
{
    static int count = 0;
    Counter()
    {
        count++;
    }
}

class Q2
{
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        System.out.println(Counter.count);
    }
}