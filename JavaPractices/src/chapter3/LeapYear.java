/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scan.nextInt();

     boolean isleapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
       
            System.out.println(year + " is a leap year? " + isleapyear);

        }

    }

