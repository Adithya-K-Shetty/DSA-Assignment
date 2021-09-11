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
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,start=0,end;
        System.out.println("Enter the array size");
        n = input.nextInt();
        end = n-1;
        int[] arr = new int[n];
        System.out.println("Enter the elemets into the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Array Before Reversing");
        System.out.println(Arrays.toString(arr));
        ReverseAnArray(arr,start,end);
    }
    static void  ReverseAnArray(int[] array,int start,int end)
    {
        int enCounter = end;
        for (int i = 0; i < array.length; i++) {
          if(enCounter < i)
              break;
          int temp = array[i];
          array[i] = array[enCounter];
          array[enCounter] = temp;
          
          enCounter--;
        }
        System.out.println("Array After Reversing");
        System.out.println(Arrays.toString(array));
    }
}
