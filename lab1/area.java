import java.util.*;

class area {
    public static void main(String[] args) {
        int a, b, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        a = sc.nextInt();
        System.out.println("Enter breadth");
        b = sc.nextInt();
        area = a * b;
        System.out.println("Area of rectangle is " + area);
    }
}