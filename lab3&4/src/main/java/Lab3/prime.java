/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Lab3;

/**
 *
 * @author student
 */
import java.util.*;

class prime {

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limits m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("The prime numbers are: ");
        for (int num = m; num <= n; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}
