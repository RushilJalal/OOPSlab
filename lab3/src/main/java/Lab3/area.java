/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

/**
 *
 * @author student
 */
import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, cir, ar;
        System.out.println("Enter length and breadth");
        l = sc.nextInt();
        b = sc.nextInt();
        cir = 2*(l+b);
        ar = l * b;
        System.out.println("Circumference: " + cir);
        System.out.println("Area: " + ar);
    }
}
