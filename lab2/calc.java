import java.util.*;
class calc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
float num1, num2, result;
char opr, choice;
do {
System.out.println("Enter first number");
num1 = sc.nextInt();
System.out.println("Enter operator");
opr = sc.next().charAt(0);
System.out.println("Enter second number");
num2 = sc.nextInt();
switch(opr) {
case '+':
result = num1 + num2;
break;
case '-':
result = num1 - num2;
break;
case '*':
result = num1 * num2;
break;
case '/';
result = num1 / num2;
break;
System.out.println("Repeat calculation(y/n)? ");
choice = sc.next().charAt(0);
}}
while(choice == 'y');
}}