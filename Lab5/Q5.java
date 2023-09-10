class Number {

    private double num;

    Number(int a) {
        num = a;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2.0 == 1;
    }

    boolean isEven() {
        return num % 2.0 == 0;
    }

    boolean isPrime() {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong() {
        int sum = 0;
        int n = (int) num;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }

        if (sum == num)
            return true;

        return false;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Number obj = new Number(5);
        System.out.println(obj.isPositive());
        System.out.println(obj.isNegative());
    }
}
