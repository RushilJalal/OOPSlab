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

    static void readMatrix(int arr[][], int row, int col) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void addMatrices(int Add[][], int arr1[][], int arr2[][], int row1, int col1, int row2, int col2) {
        if ((row1 == row2) && (col1 == col2)) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    Add[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
        } else
            System.out.println("Addition not possible");
    }

    static void multiplyMatrices(int pro[][], int arr1[][], int arr2[][], int row1, int col1, int row2, int col2) {
        if (col1 == row2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        pro[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        } else
            System.out.println("multiplication not possible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix 1: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter dimensions of matrix 2: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[p][q];
        int A[][] = new int[m][n];
        int P[][] = new int[m][q];

        // check whether addition possible

        System.out.println("Printing addition result: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }

        // check whether multiplication possible

        System.out.println("Printing multiplication result: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(P[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
