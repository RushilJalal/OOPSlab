import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int choice;
        do {
            System.out.println("1. Check palindrome");
            System.out.println("2. Write in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate original and reversed string");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkPalindrome(inputString);
                    break;
                case 2:
                    writeInAlphabeticalOrder(inputString);
                    break;
                case 3:
                    reverseString(inputString);
                    break;
                case 4:
                    concatenateStrings(inputString);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

        } while (choice != 5);
    }

    private static void checkPalindrome(String str) {
        StringBuffer reversed = new StringBuffer(str).reverse();
        if (str.equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    private static void writeInAlphabeticalOrder(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        System.out.println("String in alphabetical order: " + new String(charArray));
    }

    private static void reverseString(String str) {
        StringBuffer reversed = new StringBuffer(str).reverse();
        System.out.println("Reversed string: " + reversed);
    }

    private static void concatenateStrings(String str) {
        StringBuffer reversed = new StringBuffer(str).reverse();
        StringBuffer concatenated = new StringBuffer(str).append(reversed);
        System.out.println("Concatenated string: " + concatenated);
    }
}
