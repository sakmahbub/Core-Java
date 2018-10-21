
package chapter5;

import java.util.Scanner;


public class RepeatAdditionGame {
    public static void main(String[] args) {
        
       int number1 = (int)(Math.random() * 10);
       int number2 = (int)(Math.random() * 10);
       
        Scanner se = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int answer =se.nextInt();
        
        while(number1 + number2 !=answer){
            System.out.print("Wrong answer. Try agin. What is " + number1 + " + " + number2 + " ? ");
            answer= se.nextInt();
        
        
        }
        System.out.println("You got it! " + number1 + " + "+ number2+ " = " + answer);
    }
    
}
