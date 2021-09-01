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
public class Month {
   public static  boolean leap(int year)
   {
        if (year % 400 == 0)
            return true;
         if (year % 100 == 0)
            return false;
         if (year % 4 == 0)
            return true;
        return false;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month,monthLowerCase;
        int days=0;
        System.out.println("Enter the month");
        month = input.nextLine();
        monthLowerCase = month.toLowerCase();
        if(monthLowerCase.equals("february"))
        {
            System.out.println("Enter the year");
            int year = input.nextInt();
            days = leap(year) ? 28 : 29;
             int i =1;
             while(i<=days)
            {
                if(i % 2 == 0)
                    System.out.println("day "+i+" kunal can go out");
                else
                    System.out.println("day "+i+" kunal cant go out");
                i++;
            }
        }
        else if(monthLowerCase =="january" || monthLowerCase == "march" || monthLowerCase == "may" || monthLowerCase == "july" || monthLowerCase == "August" || monthLowerCase == "octomber" || monthLowerCase == "december")
        {
            int i = 1;
            days = 31;
            while(i<=days)
            {
                if(i % 2 == 0)
                    System.out.println("day "+i+" kunal can go out");
                else
                    System.out.println("day "+i+" kunal cant go out");
                i++;
            }
        }
        else 
        {
            days = 30;
            int i =1;
             while(i<=days)
            {
                if(i % 2 == 0)
                    System.out.println("day "+i+" kunal can go out");
                else
                    System.out.println("day "+i+" kunal cant go out");
                i++;
            }
            
        }
       
    }
}
