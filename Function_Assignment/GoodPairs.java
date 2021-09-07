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
public class GoodPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,counter = 0;
        System.out.println("Enter the size of the array");
        n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements into the array");
        for (int i = 0; i <arr.length; i++) {
           arr[i] = input.nextInt();
        }
       
        for (int i = 0; i < arr.length; i++) {
            int comp = arr[i];
             int j = 0;
            while(j < arr.length)
            {
                if(comp == arr[j] && i < j)
                {
                    counter++;
                }
                j++;
            }
            
        }
        System.out.println("Output: "+counter);
    }
    
}
