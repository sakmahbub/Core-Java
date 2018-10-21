package Evidence;

import java.util.Scanner;

public class PowerWithNumber {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = se.nextInt();
        System.out.println("Enter Power: ");
        int b = se.nextInt();
        // int a = 2;
        // int b = 3;
        System.out.println("The Answer is: " + Math.pow(a, b));

    }

}
