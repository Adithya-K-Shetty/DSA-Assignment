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
public class ListOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        prime(num1,num2);
    }
    static void prime(int n1, int n2)
    {
        int i;
        while(n1<=n2)
        {
           int flag = 0;
           for(i=2;i<=Math.sqrt(n1);i++)
           {
               if(n1%i == 0)
               {
                   flag=1;
                   break;
               }
                
           }
           if(flag!=1)
                System.out.println(n1+" is a prime number");
           n1++;
        }
    }
}
