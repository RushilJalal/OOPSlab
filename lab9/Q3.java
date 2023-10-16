import java.util.*;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = sc.next();
        StringBuffer sb1 = new StringBuffer(s1);
        int choice = 0;
        while (choice != 5) {
            System.out.println("enter choice");
            System.out.println("1. Check if palindrome");
            System.out.println("2. Convert to alphabetical");
            System.out.println("3. Reverse string");
            System.out.println("4. Concatenate original and reversed string");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // checks if palindrome
                    if (sb1.equals(sb1.reverse())) {
                        System.out.println("String is palindrome");
                    } else
                        System.out.println("Not palindrome");
                    break;

                case 2:

            }
        }
    }
}