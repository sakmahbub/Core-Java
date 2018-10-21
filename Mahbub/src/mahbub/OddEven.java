package mahbub;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        OeNumber(n);
    }

    static void OeNumber(int n) {
        if (n == 0) {
            System.out.println("The number is Zero");

        } else if (n % 2 == 0) {
            System.out.println(n + " Number is Even");

        } else {
            System.out.println(n + " Number is odd");
        }

    }
}
