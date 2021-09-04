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
public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int[] ans = new int[10];
        System.out.println("Enter 10 elements into array");
        for (int i = 0; i <=10; i++) {
            nums[i] = input.nextInt();  
        }
        for (int i = 0; i <=nums.length; i++) {
            ans[i] = nums[nums[i]]; 
        }
        System.out.println("Array From Permutation is:");
        System.out.println(Arrays.toString(ans));
        
    }
}
