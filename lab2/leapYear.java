import java.util.*;

class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;
        System.out.print("enter year: ");
        year = sc.nextInt();
        isLeapYear = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? true : false;
        
        /*
         * if (year % 4 != 0)
         * isLeapYear = false;
         * else if (year % 100 != 0)
         * isLeapYear = true;
         * else if (year % 400 != 0)
         * isLeapYear = false;
         * else
         * isLeapYear = true;
         */
        
        System.out.println(isLeapYear);
    }
}
