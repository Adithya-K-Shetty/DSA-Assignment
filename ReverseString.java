/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty;
import java.util.Scanner;
 /*
 *
 * @author Hp
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;
        String revrseString = "";
        System.out.println("Enter the string");
        inputString = input.nextLine();
        char[] array = new char[inputString.length()];
        array =inputString.toCharArray();
        for(int i=(array.length-1) ;i>=0;i--)
        {
           revrseString+=array[i];
        }
        System.out.println(revrseString);
        
    }
}
