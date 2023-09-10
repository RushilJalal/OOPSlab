
import java.util.*;
public class NonDiagonal {
    //square matrix only
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimension of square matrix");
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        System.out.println("Enter elements of square matrix");
        for(int i = 0; i < m; i++) {
            for( int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing non-diagonal elements: ");
        for(int i = 0; i < m; i++) {
            for( int j = 0; j < m; j++) {
                if((i!=j)|| (i+j == m)){
                    System.out.println(arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        
    }
}
