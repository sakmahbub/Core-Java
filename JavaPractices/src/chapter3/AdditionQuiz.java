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
public class AdditionQuiz {
    public static void main(String[] args) {
        long number1 = System.currentTimeMillis() % 10 ;
        long number2 = System.currentTimeMillis()/7  % 10 ;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        
        long answer = input.nextLong();
        
        System.out.println(number1 +" + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
    
}
