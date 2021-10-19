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
public class MatrixDiagonalSum {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
//        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
           int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] visit = new int[mat.length][mat.length];
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
            if(i == j)
            {
                 sum+=mat[i][j];
                 visit[i][j] = 1;
            }
            else
            {
                visit[i][j]=0;
                 continue;
            }
               
            }
        }
        int columnCounter = mat.length;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < columnCounter; j++) {
//                System.out.println("columnCounter:"+columnCounter+" i:"+i+" j:"+j+" result :"+visit[i][j]);
              if(j == (columnCounter-1) && visit[i][j] != 1)
              {
//                  System.out.println("Hello World");
                  sum+=mat[i][j];
              }
              else
                  continue;
            }
            columnCounter--;
        }
        System.out.println("Sum : "+sum);
    }
}
