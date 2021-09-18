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
public class CountItemsMatchingRule {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int m,n,type,counter=0,i,j;
        String ruleValue;
        System.out.println("Enter the row value");
        m = input.nextInt();
        System.out.println("Enter the colum value");
        n = input.nextInt();
        String[][] items = new String[m][n];
        System.out.println("Enter the items array");
        for ( i = 0; i < m; i++) {
            for ( j = 0; j <n; j++) {
               items[i][j] = input.next();
            }  
        }
         System.out.println("Enter rule key : 0->type, 1->color, 2->name");
         type = input.nextInt();
         System.out.println("Enter the rule value");
         ruleValue = input.next();
         for ( i = 0; i < items.length; i++) {
           if(items[i][type].equals(ruleValue))
               counter++;
        }
         System.out.println("Number of items matching the rule is :"+counter);
    }
}
