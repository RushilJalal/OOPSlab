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
public class SymmetricMatrix {
    public static void main(String[] args) {
        boolean sym = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of square matrix: ");
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        System.out.println("Enter matrix elements: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if (arr[i][j] != arr[j][i]) {
                    sym = false;
                }
            }
        }
        if(sym == true)
            System.out.println("Symmetric matrix");
        else
            System.out.println("Non symmetric matrix");
    }
}
