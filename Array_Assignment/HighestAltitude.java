/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty.Array_Assignment;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class HighestAltitude {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list of points");
        int n = input.nextInt();
        System.out.println("Enter the net gains in altitude");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int[] result = new int[n+1];
        int sum = 0;
        int flag = 0;
        int counter = 0;
        for(int i = 0; i < result.length; i++)
        {
            if( flag == 0)
            {
                result[i] = sum;
                flag = 1;
            }
            else
            {
                sum+=arr[counter];
                result[i] = sum; 
                counter++;
            }
           
        }
        int max = Integer.MIN_VALUE;
        for(int ele : result)
        {
            if(ele >= max)
                max = ele;
        }
        System.out.println("Max Altitude Is : "+max);
    }
}
