
package chapter4;

import java.util.Scanner;

public class ConcatEx {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Values");
        String s1 = se.nextLine();
        String s2 = se.nextLine();
        String s3 = se.nextLine();
        
        String s4 = s1 + s2 + s3;
        System.out.println("3 String is : "  +  s1.concat(s2).concat(s3));
        System.out.println("S4 :" + s4);
    }
}
