import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        int choice;
        do {
            System.out.println(
                    "\nMenu:\n1. Compare strings\n2. Convert case\n3. Check substring\n4. Replace substring with 'Hello'\n5. Exit");
            System.out.println("Enter your choice (1-5):");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    compareStrings(str1, str2);
                    break;
                case 2:
                    convertCase(str1, str2);
                    break;
                case 3:
                    checkSubstring(str1, str2);
                    break;
                case 4:
                    replaceSubstring(str1, str2);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Enter a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void compareStrings(String s1, String s2) {
        System.out.println(s1.equals(s2) ? "The strings are equal." : "The strings are not equal.");
    }

    private static void convertCase(String s1, String s2) {
        System.out.println("Uppercase to lowercase and vice-versa:");
        System.out.println("Converted s1: " + swapCase(s1));
        System.out.println("Converted s2: " + swapCase(s2));
    }

    private static String swapCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static void checkSubstring(String s1, String s2) {
        System.out.println((s1.contains(s2) || s2.contains(s1)) ? "One string is a substring of the other."
                : "The strings are not substrings of each other.");
    }

    private static void replaceSubstring(String s1, String s2) {
        if (s1.contains(s2))
            System.out.println("Replaced string: " + s1.replace(s2, "Hello"));
        else if (s2.contains(s1))
            System.out.println("Replaced string: " + s2.replace(s1, "Hello"));
        else
            System.out.println("No substring found for replacement.");
    }
}
