import java.util.*;
import java.lang.Math;
class roots{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a, b, c;
double dis, root1, root2;    
System.out.println("Enter first coefficient");
a = sc.nextInt();
System.out.println("Enter second coefficient");
b = sc.nextInt();
System.out.println("Enter third coefficient");
c = sc.nextInt();
dis = b * b - 4 * a * c;
if (dis > 0) { 
System.out.println("Roots are real and equal");
root1 = root2 = -b / (2*a);
System.out.println("The root is "+root1);
}
else if(dis == 0) {
System.out.println("Roots are real and distinct");
root1 = (-b + Math.sqrt(dis)) / (2 * a);
root2 = (-b - Math.sqrt(dis)) / (2 * a);
System.out.println("The roots are "+root1+" and "+root2);
}
else {
System.out.println("Roots are imaginary");
root1  = -b/(2*a);
root2 = Math.sqrt(-dis) / (2 * a);
System.out.println("The roots are "+root1+ " +i"+ root2 + " and "+root1+" -i"+ root2);
}
}}