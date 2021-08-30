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
public class EletricityBillDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int unit;
        float unitCharge,serviceCharge,totalAmount;
        System.out.println("Enter the unit consumed");
        unit = input.nextInt();
        
        if(unit <= 50)
        {
            unitCharge = unit * 0.5f;
        }
        else if(unit > 50 && unit <=150)
        {
            unitCharge = 25 + (unit - 50) * 0.75f;
        }
        else if(unit > 150 && unit <=250)
        {
            unitCharge = 50 + (unit - 150) * 1;
        }
        else 
        {
            unitCharge = 100 + (unit - 250) * 1.15f;
        }
        
        serviceCharge = unitCharge * 0.2f;
        totalAmount = unitCharge + serviceCharge;
        System.out.println("Total Electricity Bill : "+totalAmount);
    }
}
