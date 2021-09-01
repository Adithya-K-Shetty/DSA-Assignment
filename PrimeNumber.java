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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,flag=1;
        System.out.println("Enter the number to check whether its prime or not");
        n = input.nextInt();
        int limit = (int) Math.floor(Math.sqrt(n));
        i=2;
        while(i<=limit)
        {
            if(n%i == 0)
            {
                flag++;
                break;
            }
            i++;       
        }
        if(flag > 1)
            System.out.println(n+" is a not prime number");
        else
            System.out.println(n+" is a prime number");
    }
  
}
