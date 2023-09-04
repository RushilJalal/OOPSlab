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
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, lastD, ognum;
        boolean isArmstrong = false;
        System.out.println("Enter number: ");
        num = sc.nextInt();
        ognum = num;
        while (num > 0) {
            lastD = num % 10;
            num /= 10;
            sum += Math.pow(lastD, 3);
        }
        if (sum == ognum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
