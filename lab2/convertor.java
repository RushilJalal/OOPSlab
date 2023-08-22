import java.util.*;
class convertor {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i;
double d;
char c;
System.out.println("Enter int: ");
i = sc.nextInt();
System.out.println("Enter double: ");
d = sc.nextDouble();
System.out.println("Enter char: ");
c = sc.next().charAt(0);
System.out.println("int to byte: " + (byte)i);
System.out.println("char to int: " + (int)c);
System.out.println("double to byte: " + (byte)d);
System.out.println("double to int: " + (int)d);
}}

