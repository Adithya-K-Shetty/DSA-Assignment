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
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter the number");
        n = input.nextInt();
        i = 1;
        while(i<n)
        {
            if(n%i == 0)
            {
                sum+=i;
            }
            i++;
        }
        if(sum == n)
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+" is not a perfect number");
    }
}
