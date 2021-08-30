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
public class ProAndSumDiff {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,sum = 0,product = 1,Differnce;
       System.out.println("Enter the number");
       n = input.nextInt();
       while(true)
       {
           if(n != 0)
           {
               int temp = n%10;
               sum = sum + temp;
               product = product*temp;
               n = n/10;
           }
           else
               break;
       }
        Differnce = product - sum;
        System.out.println("Result is = "+Differnce);
    }
}
