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
public class passFailNew {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter obtained Number: ");
        int obtainMark = scan.nextInt();

        if (obtainMark >= 40 && obtainMark < 50) {
            System.out.println("Grade D");
        } else if (obtainMark >= 50 && obtainMark < 60) {
            System.out.println("Grade C");
        } else if (obtainMark >= 60 && obtainMark < 70) {
            System.out.println("Grade B");
        } else if (obtainMark >= 70 && obtainMark < 80) {
            System.out.println("Grade A");
        } else if (obtainMark >= 80 && obtainMark <= 100) {
            System.out.println("Grade A+");
        } else if (obtainMark >= 0 && obtainMark < 40) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid Number");
        }
    }

}
