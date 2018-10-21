package mahbub;

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int sum = 0;
        for (int i = 0;; i++) {
            int n = sc.nextInt();

            if (n != 0) {
                sum += n;

            } else {
                System.out.println("Total sum: " + sum);
            }

        }
    }

}
