package Evidence;

import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = se.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("The Factorial number is: " + fact);
    }

}
