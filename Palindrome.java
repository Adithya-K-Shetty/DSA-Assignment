/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number to check whther its palindrome");
        n = input.nextInt();
        Palindrome(n);
    }
    static void Palindrome(int n)
    {
        int reverseNumber=0,originalNumber;
        originalNumber = n;
        while(n>0)
        {
           int temp = n%10;
           reverseNumber = reverseNumber *10 +temp;
           n = n/10;
           
        }
        if(reverseNumber == originalNumber)
            System.out.println(originalNumber+ " is palindrome");
        else
            System.out.println(originalNumber+" is not palindrome");
    }
   
}
