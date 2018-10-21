package Evidence;

import java.util.Scanner;

public class SumUsingMethod {

    public static void main(String[] args) {

        // SumUsingMethod mm = new SumUsingMethod();
        // int nn = mm.makeSum(10, 1);
        // System.out.println("Total sum : " + nn);
        Scanner se = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int p = se.nextInt();
        System.out.println("Enter 1ast number: ");
        int q = se.nextInt();
        System.out.println("Total Sum: " + makeSum(p, q));

    }

    public static int makeSum(int x, int y) {
        int sum = 0;
        if (x > 0 || y > 0) {
            if (x > y) {
                for (int i = x; i >= y; i--) {
                    sum += i;

                }

            } else if (x < y) {
                for (int i = x; i <= y; i++) {
                    sum += i;
                }

            } else if (x == y) {
                sum += x;

            }

        } else {
            sum = -1;
        }
        return sum;
    }

}
