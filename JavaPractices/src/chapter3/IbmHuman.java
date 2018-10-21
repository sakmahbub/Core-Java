/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author MAHBUB
 */
public class IbmHuman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter weight in Kg: ");
        double weight = input.nextDouble();

      
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

       
        final double METERS_PER_INCH = 0.0254;

        
        double weightInKilograms = weight ;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms
                / (heightInMeters * heightInMeters);

       
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
