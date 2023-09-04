import java.util.*;

class largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, largest;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();
        largest = a > b ? a : b > c ? b : c;
        System.out.println("Largest is " + largest);
    }
}