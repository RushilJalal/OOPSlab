/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Lab4;

/**
 *
 * @author student
 */
import java.util.*;

public class Add_Multiply_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix 1: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter dimensions of matrix 2: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        int A[][] = new int[m][n];
        int P[][] = new int[m][q];
        System.out.println("Enter elements of arr1");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of arr2");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        // check whether addition possible
        if ((m == p) && (n == q)) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            System.out.println("Printing addition result: ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println("");
            }
        } else
            System.out.println("Addition not possible");

        // check whether multiplication possible
        if (n == p) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < n; k++) {
                        P[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("Printing multiplication result: ");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(P[i][j] + " ");
                }
                System.out.println("");
            }
        } else
            System.out.println("Multiplication not possible");
    }
}
