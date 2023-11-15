import java.util.Scanner;

public class MatrixValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the order of the square matrix:");
            int order = scanner.nextInt();

            int[][] matrix = new int[order][order];

            System.out.println("Enter the elements of the matrix:");

            for (int i = 0; i < order; i++) {
                for (int j = 0; j < order; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            validateMatrix(matrix);

            System.out.println("The entered matrix is a square matrix.");
        } catch (MatrixValidationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void validateMatrix(int[][] matrix) throws MatrixValidationException {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows != columns) {
            throw new MatrixValidationException("The matrix is not square.");
        }
    }
}

class MatrixValidationException extends Exception {
    public MatrixValidationException(String message) {
        super(message);
    }
}
