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
public class SwitchStatement {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.print("Enter an Input: ");

        int status = se.nextInt();

        switch (status) {
            case 0:
                System.out.println("00000000");
                break;

            case 1:
                System.out.println("1111111111");
                break;

            case 2:
                System.out.println("2222222222");
                break;

            case 3:
                System.out.println("33333333");
                break;

            default:
                System.out.println(".....Default........");
               

        }
    }
}

