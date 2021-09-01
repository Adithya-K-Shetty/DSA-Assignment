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
public class DifferentSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum1 =0, sum2 = 0,sum3 = 0;
        System.out.println("Enter the numbers to finad sum of"
                + "negative numbers, even numbers, sum of "
                + "even numbers \n Enter 0 to terminate the "
                + "input process");
        while(true)
        {
            int inputNumber = input.nextInt();
            if(inputNumber!=0)
            {
                if(inputNumber < 0)
                    sum1+=inputNumber;
                else if(inputNumber % 2 == 0)
                    sum2+=inputNumber;
                else 
                    sum3+=inputNumber;
            }
            else
                break;
        }
        System.out.println("Sum of negative numbers = "+sum1);
        System.out.println("Sum of even numbers = "+sum2);
        System.out.println("Sum of odd numbers = "+sum3);
     
    }
}
