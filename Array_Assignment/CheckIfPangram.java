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
public class CheckIfPangram {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inString;
    int index = 0, flag = 1;
    boolean alphaList[] = new boolean[26];
    System.out.println("Enter the string");
    inString = input.nextLine();
        for (int i = 0; i < inString.length(); i++) {
            if(inString.charAt(i) >='A' && inString.charAt(i) <= 'Z')
                index = inString.charAt(i) - 'A';
            else if(inString.charAt(i) >= 'a' && inString.charAt(i) <= 'z')
                index = inString.charAt(i) - 'a';
            alphaList[index] = true;
            
        }
        for (int i = 0; i < alphaList.length; i++) {
          if(alphaList[i] == false)
          {
              flag = 0;
               break; 
          }
          else
              flag = 1;
            
        }   
        if(flag == 0)
            System.out.println("Entered String Is Not Panagram");
        else
            System.out.println("Entered String Is Panagram");
    }
    
       
    
}
