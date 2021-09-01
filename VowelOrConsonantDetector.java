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
public class VowelOrConsonantDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter the character ");
        ch = input.nextLine().trim().charAt(0);
        switch(ch)
        {
//            case 'a':
//            case 'A': System.out.println(ch+" is vowel");
//                      break;
//            case 'e':
//            case 'E':System.out.println(ch+" is vowel");
//                     break;
//            case 'i':
//            case 'I':System.out.println(ch+" is a vowel");
//                     break;
//            case 'u':
//            case 'U':System.out.println(ch+" is a vowel");
//                     break;
//            default:System.out.println(ch+" is a consonant");
            case 'a': case 'A': case 'e':case 'E':case 'i': case 'I':
            case 'o': case 'O': case 'u': case 'U': System.out.println(ch+" is vowel");
            break;
            default:System.out.println(ch+" is consonant");
        }
        
    }
 
}
