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
public class OddEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter OddEven Number: ");
        int number = s.nextInt();

        if (number % 2 == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }
    }

}
