package mahbub;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        isPrime(num);
    }

    static void isPrime(int n) {
        if (BigInteger.valueOf(n).isProbablePrime(1)) {
            System.out.println("Number is prime");

        } else {
            System.out.println("Number is Not prime");
        }

    }
}
