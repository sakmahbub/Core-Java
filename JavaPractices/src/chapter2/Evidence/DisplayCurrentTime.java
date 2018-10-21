/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.Evidence;

/**
 *
 * @author User
 */
public class DisplayCurrentTime {
    public static void main(String[] args) {
        long totalMillisecounds = System.currentTimeMillis();
        
        long totalSecounds = totalMillisecounds / 1000;
        long currentSecound = totalSecounds % 60;
        
        long totalMinutes = totalSecounds /60;
        long currentMinutes = totalMinutes % 60 ;
        
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        
        System.out.println("Current Time is  " + currentHours + ":" + currentMinutes + ":" + currentSecound + " GMT");
    }
    
}

    

