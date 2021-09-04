/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty.Function_Assignment;
import java.util.*;
/**
 *
 * @author Hp
 */
public class RunningSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the size of the array");
        n = input.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = input.nextInt();  
        }
        for (int i = 0; i < n; i++) {
           sum+=arr[i];
           result[i] = sum;  
        }
        System.out.println("Resultin Array");
        System.out.println(Arrays.toString(result));
    }
}
