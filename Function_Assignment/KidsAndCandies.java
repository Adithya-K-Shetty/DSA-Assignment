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
public class KidsAndCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,extraCandie,childNumber,max=0,flag = 0,counter=0;
        System.out.println("Enter the number of kids");
        n = input.nextInt();
        int[] candies = new int[n];
        boolean[] resultCandie = new boolean[n];
        System.out.println("Enter the candies array");
        for(int i=0 ; i < n; i++)
            candies[i] = input.nextInt();
        System.out.println("Enter the count of extra candies");
        extraCandie = input.nextInt();
        for(int i = 0; i < n ; i++)
        {
            max = candies[i] + extraCandie;
//            System.out.println(max);
            int j = 0;
            while(j < n)
            {
                if(max>=candies[j])
                    flag = 1;
                else{
                    flag = 0;
                    break;
                }
                j++;
            }
//            System.out.println(flag);
            if(flag == 1)
            {
                resultCandie[counter] = true;
                counter++;
            }
            else
            {
                resultCandie[counter] = false;
                counter++;
            }
            
              
        }
        System.out.println("Resulting Boolean Array");
        System.out.println(Arrays.toString(resultCandie));
            
    }
}
