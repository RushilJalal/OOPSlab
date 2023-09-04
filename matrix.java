import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        System.out.println("Enter elements of arr1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = arr1[i][j];
                int sum = 0;
                int lastD = 0;
                while (num > 0) {
                    lastD = num % 10;
                    num /= 10;
                    sum += lastD;
                }
                arr2[i][j] = sum;
            }
        }

        System.out.println("Printing arr2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
