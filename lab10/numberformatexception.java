import java.util.*;

public class numberformatexception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            String s = sc.next();
            int n = Integer.parseInt(s);
            n++;
            System.out.println("next number is " + n);
        } catch (NumberFormatException e) {
            System.out.println("No number found");
        }
        sc.close();
    }
}