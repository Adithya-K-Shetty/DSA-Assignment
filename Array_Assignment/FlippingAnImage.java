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
public class FlippingAnImage {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the value for row and coloumn :");
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr = new int[m][n];
        int[][] resultArray = new int[m][n];
        System.out.println("Enter the images ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Input Arrsy Is : "+m);
        for (int i = 0; i < arr.length; i++) {
            int k=0;
            for (int j = ( arr.length - 1); j >= 0; j--) {
                if(arr[i][j] == 1)
                    resultArray[i][k] = 0;
                else
                   resultArray[i][k] = 1;  
                k++;
            }
            
        }
        System.out.println("[");
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray.length; j++) {
                if(j == 0)
                    System.out.print("[");
                System.out.print(resultArray[i][j]+" ");
                if(j == 2)
                    System.out.println("],");
                
            }
            
        }
        System.out.println("]");
    }
}
