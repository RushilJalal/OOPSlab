import java.util.*;
class circle {
public static void main(String[] args) {
int r;
double area, cir;
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius");
r = sc.nextInt();
area = 3.14 * r * r;
cir = 2 * 3.14 * r;
System.out.println("Circumference of circle is "+area);
System.out.println("Area of circle is "+area);
}}