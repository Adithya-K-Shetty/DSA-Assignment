/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty.Function_Assignment;
import java.io.InputStream;
import java.util.*;
/**
 *
 * @author Hp
 */
public class RichestCustomer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the number of customer and number of banks");
        m = input.nextInt();
        n = input.nextInt();
        int[][] arr = new int[m][n];
        int[] customerWealth= new int[m];
        System.out.println("Enter the wealth of the cutomer in the respective banks");
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        int counter = 0,max=0,person1=0,flag=0,person2=0;
        for(int i = 0;i<m;i++)
        {
            int sum =0;
            for(int j = 0;j<n;j++)
            {
                sum+=arr[i][j];
            }
            customerWealth[counter] = sum;
            counter++;
        }
        for(int i=0;i<m;i++)
        {
            if(customerWealth[i]>max)
            {
                max = customerWealth[i];
                person1 = i+1;
                flag = 1;
            }
            else if(customerWealth[i] == max)
            {
                flag = 0;
                int max2 = max;
                person2 = i+1;
                flag = 0;
            }
                
        }
        if(flag == 1)
            System.out.println("customer "+person1+" has the highest wealth of "+max);
        else
            System.out.println("customer "+person1+" and "+person2+" has the highest wealth of "+max);
        
    }
  
}
