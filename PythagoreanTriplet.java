/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adithya_K_Shetty;
import java.util.Scanner;
import javax.swing.InputMap;
/**
 *
 * @author Hp
 */
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1,num2,num3;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
       //pyTriplet(num1,num2,num3);
        System.out.println(pyTriplet(num1,num2,num3)?"Yes it is a pyTriplet":"No it is not a pyTriplet");
        
    }
    static boolean pyTriplet(int n1,int n2,int n3)
    {
        int nsp3 = n3*n3;
        int nsp2 = n2*n2;
        int nsp1 = n1*n1;
        return (nsp3 == nsp1+nsp2);
    }
}
