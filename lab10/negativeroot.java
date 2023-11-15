import java.util.Scanner;

public class negativeroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a negative number:");
            double number = scanner.nextDouble();

            if (number < 0) {
                double root = calculateNegativeRoot(number);
                System.out.println("Negative square root: " + root);
            } else {
                throw new IllegalArgumentException("Please enter a negative number.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double calculateNegativeRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            return Math.sqrt(Math.abs(number)) * Math.sqrt(-1);
        } else {
            throw new IllegalArgumentException("Input should be a negative number.");
        }
    }
}
