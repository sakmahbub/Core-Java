package Evidence;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int a = sc.nextInt();
        System.out.println("Input 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Input 1ast number: ");
        int c = sc.nextInt();
        isLargestNumber(a, b, c);
    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is largest number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is largest number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is largest number");
        } else {

            System.out.println(n1 + ", " + n2 + ", " + n3 + " are Equal ");
        }

    }

}
