package Evidence;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = sc.nextInt();
        isOddEven(n);

    }

    static void isOddEven(int num) {
        if (num == 0) {
            System.out.println("number is Zero");
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " is Even number");
            } else {
                System.out.println(num + " is ODD number");
            }

        }

    }
}
