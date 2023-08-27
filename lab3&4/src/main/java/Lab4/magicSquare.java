/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author student
 */
//program to determine if matrix is magic square
// sum for every row, the sum with every column, the sum of the principal diagonal and the sum of the non-principal diagonal elements.
import java.util.Scanner;

public class magicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean MS = true;
        int sumr, refsum, sumc, sump, sumnp;
        System.out.println("Enter dimension of square matrix: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // calc reference sum
        refsum = 0;
        for (int i = 0; i < n; i++)
            refsum += arr[0][i];

        
        // checking sum of rows
        for (int i = 0; i < n; i++) {
            sumr = sumc = 0;
            for (int j = 0; j < n; j++) {
                sumr += arr[i][j];
                sumc += arr[j][i];
            }
            if (sumr != refsum || sumc != refsum) {
                System.out.println("sumr or sumc != refsum");
                MS = false;
            }
        }

        // calc sum of principal and non-principal diagonal
        sump = sumnp = 0;
        for (int i = 0; i < n; i++) {
            sump += arr[i][i];
            sumnp += arr[i][n - i - 1];
        }

        if (sump != refsum || sumnp != refsum) {
            System.out.println("sump or sumnp != refsum");
            MS = false;
        }

        if (MS == true)
            System.out.println("Magic square");

        else
            System.out.println("Not magic square");
    }
}
