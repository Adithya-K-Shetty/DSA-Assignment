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
public class GradeDetector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks");
        marks = input.nextInt();
        gradeDetector(marks);
    }
    static  void gradeDetector(int mark)
    {
        if(mark >= 91)
            System.out.println("Equivalent Grade -> AA");
        else if(mark<=90 && mark>=81)
            System.out.println("Equivalent Grade -> AB");
        else if(mark<=80 && mark>=71)
            System.out.println("Equivalent Grade ->BB");
        else if(mark<=70 && mark>=61)
            System.out.println("Equivalent Grade ->BC");
         else if(mark<=60 && mark>=51)
            System.out.println("Equivalent Grade ->BC");
         else if(mark<=50 && mark>=41)
            System.out.println("Equivalent Grade ->BC");
         else 
             System.out.println("Fail");
    }
}
