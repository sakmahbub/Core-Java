package Evidence;

import chapter3.*;
import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the sum numbers: ");

        int sum = 0;
        for (int i = 0;; i++) {
            int a = se.nextInt();

            if (a != 0) {
                sum += a;

            } else {
                System.out.println("Total Sum is: " + sum);
            }

        }
    }
}
