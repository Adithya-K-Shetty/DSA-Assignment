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
public class CellsWithOddValues {
    public static void main(String args[])
    {
        int m,n,flag=0,rowno=0,columno=0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for the row and column : ");
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr = new int[m][n];
        int[][] indices = {{0,1},{1,1}};
        out:
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length; j++) {
                if(flag == 0)
                {
                    rowno = indices[i][j];
                    flag = 1;
                }
                else
                {
                     columno = indices[i][j];
                     flag = 0;
                }
                   
                if(flag == 1)
                    continue;
                for (int k = 0; k <  arr.length; k++) {
                    for (int l = 0; l <  arr.length; l++) {
                      arr[rowno][l]+=1;
                      arr[k][columno]+=1;
                    }
                    
                }
                    
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("\n");
            
        }
        
        }
    }
