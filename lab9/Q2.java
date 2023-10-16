
//input 2 strings, replace repeating characters in string 1 with string2
//ex: string1: Hello string2: MIT output: HeMITMITo
import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string1, string2");
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuffer sb1 = new StringBuffer(s1);
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.lastIndexOf(s1.charAt(i)) != s1.indexOf(s1.charAt(i))) {
                sb1.replace(i, i + 1, s2);// takes string from start to end(exclusive) with s2
            }
        }
        System.out.println("Output: " + sb1);
    }
}
