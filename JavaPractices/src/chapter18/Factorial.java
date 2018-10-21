package chapter18;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer: ");
        int num = se.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

}
