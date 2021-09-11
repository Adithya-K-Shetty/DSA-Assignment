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
public class CreatingTargetArray {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int m,n,indexCounter;
       System.out.println("Enter the array size");
       m = input.nextInt();
       System.out.println("Enter the index size");
       n = input.nextInt();
       int[] arr = new int[m];
       int[] index = new int[n];
       int[] target = new int[n];
       System.out.println("the elements for array");
        for (int i = 0; i < arr.length; i++) {
           arr[i] = input.nextInt(); 
        }
         System.out.println("the elements for index");
        for (int i = 0; i < index.length; i++) {
            index[i] = input.nextInt();
            
        }
        for (int i = 0; i < index.length; i++) {
          indexCounter = index [i];
          if(target[indexCounter] == 0)
              target[indexCounter]=arr[i];
          else{
             int j = target.length-1;
              do {   
                  target[j] = target[j-1];
                  j--;
              } while (j>indexCounter);
              target[j] = arr[i];
          }
            
        }
        System.out.println("Resulting Array");
        System.out.println(Arrays.toString(target));
        
    }
}
