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
public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,counter=0,count=0;
        System.out.println("Enter the size of the array");
        n = input.nextInt();
        int[] arr = new int[n];
        int[] result = new int[2*n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        while(counter<2)
        {
            for(int i=0;i<n;i++)
            {
                result[count] = arr[i];
                count++;
            }
            counter++;
        }
        System.out.println("Array After Concatenation");
        System.out.println(Arrays.toString(result));
    }
}
