package Evidence;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter number: ");
        int fact = se.nextInt();
        getFactorials(fact);

    }

    static void getFactorials(int n) {

        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));// f= f * i

        }
        System.out.println("The factorial number " + n + " is: " + f);

    }
}
