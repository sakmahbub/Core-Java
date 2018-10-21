/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;

/**
 *
 * @author User
 */
public class NumericTypeConversion {
    public static void main(String[] args) {
        int x =10;
        long y = x;
        System.out.println("X :" + x + "\n" + "Y :" + y);
        
        long p = 15;
        int q = (int)p;
        System.out.println("P :" + p);
   
        long m = 500;
        int n= (int)m;
        System.out.println("M :" + m +" And " +"N :" +n);
                
    }
    
}
