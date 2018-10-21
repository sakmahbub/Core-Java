/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JustSumOfxAndY {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of X");
        int x=sc.nextInt();
        
        System.out.println("Enter value of Y");
        int y=sc.nextInt();
        
        double sum = x+y;
        System.out.println("The sum of "+x+ " and " + y + " is: " + sum);
    }
    
}
