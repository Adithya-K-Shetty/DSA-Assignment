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
public class SuffleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,counter=0;
        System.out.println("Enter the size of the array");
        n = input.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0; i<n; i++)
            arr[i] = input.nextInt();
        int j = (n/2);
 outerLoop:for(int i=0;i<(n/2);i++)
        {
            result[counter] = arr[i];
            counter++;
           while(j < n)
           {
               result[counter] = arr[j];
               j++;
               counter++;
               continue outerLoop;
           }
        }
        System.out.println("Resulting SHuffled Array");
        System.out.println( Arrays.toString(result));
    }
}
