
import java.util.*;

public class PrincipalDiagonalElementsQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of rectangular elements: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int arr[][] = new int[m][n];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing principal diagonal elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("Sum of principal diagonal elements: " + sum);
    }
}
