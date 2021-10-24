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
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{1,2,3},{4,5,6}};
        int row = arr.length;
        int col = arr[0].length;
        int[][] new_arr = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//               if(i != j)
//               {
//                   new_arr[j][i] = arr[i][j];
//               }
//               else if( i == j)
//                   new_arr[i][j] = arr[i][j];
//               else
//                   continue;
                new_arr[j][i] = arr[i][j];
            }
            
        }
        for (int i = 0; i < new_arr.length; i++) {
            for (int j = 0; j < new_arr[i].length; j++) {
                System.out.print(new_arr[i][j]+" ");   
            }
            System.out.println(""); 
        }
    }
}
