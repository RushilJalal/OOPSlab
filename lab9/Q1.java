import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int charCount = inputString.length();
        int wordCount = inputString.split(" ").length;
        int lineCount = inputString.split("\n").length;
        int vowelCount = countVowels(inputString);

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Vowel count: " + vowelCount);
        scanner.close();
    }

    private static int countVowels(String input) {
        int count = 0;
        String lowercaseInput = input.toLowerCase();

        for (int i = 0; i < lowercaseInput.length(); i++) {
            char ch = lowercaseInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
