package mahbub;

import java.util.Scanner;

public class BigNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt();
       
        isBigNumber(a, b, c);
    }

    static void isBigNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Big number");

        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Big number");

        } else if (n3 > n2 && n3 > n1) {
            System.out.println(n3 + " is Big number");

        } 

         if (n1 < n2 && n1 < n3) {
            System.out.println(n1 + " is small number");

        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2 + " is small number");

        } else if (n3 < n2 && n3 < n1) {
            System.out.println(n3 + " is small number");

        }
    }

}
