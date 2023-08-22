import java.util.*;
class NetSalary {
public static void main(String[] args) {
int basic;
double da, hr, gs, d, ns;
Scanner sc = new Scanner(System.in);
System.out.println("Enter basic");
basic = sc.nextInt();
da = 0.2*basic;
hr = 0.08*basic;
gs = basic + da + hr;
d = 0.1* gs;
ns = gs - d;
System.out.println("Net salary: "+ns);
}}