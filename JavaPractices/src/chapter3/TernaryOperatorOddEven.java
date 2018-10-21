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
public class TernaryOperatorOddEven {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = se.nextInt();
        System.out.println((num % 2 == 0) ? num + " Number is even" : num + " Number id odd");
    }

}
