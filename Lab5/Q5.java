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
        boolean check = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        return check ? true : false;
    }

    boolean isArmstrong() {
        int sum = 0;
        int n = num;

        while (n > 0) {
            int rem = n % 10;
            sum += pow(rem, 3);
            n /= 10;
        }

        if (sum == num)
            return true;
        return false;
    }
}

public class Q5 {
    public static void main(String[] args) {

    }
}
