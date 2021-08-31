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
public class PermutationAndCombination {
   public long fact(long n)
   {
       long fact = 1;
       while(true)
       {
           if(n == 0)
           {
               fact*=1;
               return fact;
           }
           else
           {
               fact*=n;
               n--;
           }
       }
   }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intOption;
        long n,r,n1,r1,d;
        long result;
        char option;
        PermutationAndCombination obj = new PermutationAndCombination();
        System.out.println("Enter the value for n");
        n = input.nextInt();
        System.out.println("Enter the valur for r");
        r = input.nextInt();
        System.out.println("1->Enter '1' : Permutation\n2-> Enter '2' : Combination");
        intOption = input.nextInt();
        option = Integer.toString(intOption).charAt(0);
        switch(option)
        {
            case '1':d=n-r;
                     d=obj.fact(d);
                     n1 = obj.fact(n);
                     r1 = obj.fact(r);
                     result = n1/d;
                     System.out.println("Permutation: "+result);
                     break;
            case '2':d=n-r;
                     d=obj.fact(d);
                     System.out.println("d->"+d);
                     n1 = obj.fact(n);
                     System.out.println("n1->"+n1);
                     r1 = obj.fact(r);
                     System.out.println("r1->"+r1);
                     result = n1/(r1*d);
                     System.out.println("Combination: "+result);
                     break;
            default :System.out.println("Entera valid choice");
                     break;
        }
               
    }
}
