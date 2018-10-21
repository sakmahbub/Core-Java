package mahbub;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fact = sc.nextInt();
        getFactorial(fact);
    }
    
    static void getFactorial(int n){
        BigInteger f= BigInteger.valueOf(1);
        for(int i=1; i<=n; i++ ){
            f = f.multiply(BigInteger.valueOf(i));
        
        }
        System.out.println("The factrial number "+ n + " is : " + f);
    }
}
