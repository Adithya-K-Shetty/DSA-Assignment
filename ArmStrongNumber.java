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
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the number");
        n = input.nextInt();
        int m =n;
        while(m!=0)
        {
            int temp = m%10;
            sum = sum+ (int) Math.pow(temp, 3);
            m = m/10;
        }
        System.out.println(sum);
        if(sum == n)
            System.out.println(n+" is a armstrong number");
        else
            System.out.println(n+" is not a armstrong number");
    }
}
