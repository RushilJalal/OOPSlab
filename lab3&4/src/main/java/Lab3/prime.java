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
public class prime {
    public static void main(String[] args) {
        boolean prime = true;
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limits m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("The prime numbers are: ");
        for (int num = m; num <= n; num++) {
            for (int i=2; i < num;  i++) {
                if(num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true)
                System.out.print(num + " ");
        }
    }
}
