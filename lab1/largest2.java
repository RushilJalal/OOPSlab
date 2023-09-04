import java.util.*;

class largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is largest");
        else
            System.out.println(b + " is largest");
    }
}