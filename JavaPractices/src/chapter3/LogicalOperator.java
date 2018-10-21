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
public class LogicalOperator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int num = scan.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Yes");
        }else{System.out.println("No");
        }
        
        
         if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Yes");
        }else{System.out.println("No");
        }
         
         
         
          if (num % 2 == 0 ^ num % 3 == 0) {
            System.out.println("Yes");
        }else{System.out.println("No");
        }
        
    }
}
