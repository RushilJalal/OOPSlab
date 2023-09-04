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
public class eleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val, index = 0;
        int a[] = {1,2,3,1,2,1,5,6,7};
        System.out.println("Enter value to be searched: ");
        val = sc.nextInt();
        System.out.println("The value is found at locations:");
        for (int ele: a) {
            if(ele == val)
                System.out.print("a[" + index + "], ");
            index++;
        }
    }
}
