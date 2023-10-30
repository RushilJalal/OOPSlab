import java.util.*;

public class StudentDetailsQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter roll number: ");
        String rollno = sc.next();
        System.out.println("Enter marks of 3 subjects: ");
        String mark1 = sc.next();
        String mark2 = sc.next();
        String mark3 = sc.next();
        try {
            String grade;
            int m1 = Integer.parseInt(mark1);
            int m2 = Integer.parseInt(mark2);
            int
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            m3 = Integer.parseInt(mark3);
            double percentage = (m1 + m2 + m3) / 300 * 100;
            if (percentage > 90)
                grade = "A";
            else if (percentage > 80)
                grade = "B";
            else if (percentage > 70)
                grade = "C";
            else
                grade = "D";

        } catch (NumberFormatException e) {
            System.out.println("Enter number instead of characters");
        }
    }
}
