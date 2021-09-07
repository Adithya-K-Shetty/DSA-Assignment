/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty.Array_Assignment;
import java.util.*;
/**
 *
 * @author Hp
 */
public class SmallerThanC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the array size");
        n = input.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int comp = arr[i];
            int counter = 0;
            while(j < arr.length)
            {
                if(comp > arr[j] && i!=j)
                {
                    counter++;
                }
                j++;
            }
            result[count] = counter;
            count++;
            
        }
        System.out.println("Resulting Array Is :");
        System.out.println(Arrays.toString(result));
    }
  
}
