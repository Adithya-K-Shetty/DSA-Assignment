/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class AverageOfNNumbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,sum=0;
       double result;
       System.out.println("Enter the numbers to calculate the average");
       n = input.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter "+n+" numbers");
        for (int i = 0; i < n; i++) {
           arr[i] = input.nextInt();
        }
        System.out.println("Average of "+n+" numbers is:");
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        result = sum/n;
        System.out.println("Average : "+result);
        
    }
}
