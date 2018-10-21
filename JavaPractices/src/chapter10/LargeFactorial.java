package chapter10;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Factorial number: ");
        int fact=se.nextInt();
        System.out.println("The Factorial of "+ fact + " is: " + factorial(fact));
        
       // System.out.println("Factorial of 50! is: \n" + factorial(80));
    }

    public static BigInteger factorial(long n) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }

        return result;
    }
}
