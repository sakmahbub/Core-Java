package mahbub;

import java.util.Scanner;

public class BigSmall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        isLargestNumber(a, b, c);
    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largest Number");
        } else if (n1 < n2 && n1 < n3) {
            System.out.println(n1 + " is Smaller Number");

        }

        if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Largest Number");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2 + " is smaller Number");
        }

        if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is Largest Number");
        } else if (n3 < n1 && n3 < n2) {
            System.out.println(n3 + " is Smaller Number");
        }

    }
}
