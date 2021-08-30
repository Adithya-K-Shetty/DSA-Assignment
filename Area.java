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
public class Area {
    static final float cons = (float) (Math.sqrt(3)/4);
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float a,result;
      System.out.println("Enter the valid values for side");
      a = input.nextInt();
      result = (float) (cons * Math.pow(a, 2));
        System.out.println("Area="+result);
    }
}
