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
public class NumberWithEvenDigit {
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       int counter = 0;
       int[] nums = {12,345,2,6,7896};
       for (int i = 0; i < nums.length; i++) {
           if(String.valueOf(nums[i]).length() % 2 == 0)
               counter++;
           else
               continue;
       }
       System.out.println("result : "+counter);
       
   }
}
