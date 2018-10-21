package Evidence;

import java.util.Scanner;

public class AddSumMulDiv {

    public static void main(String[] args) {
        //System.out.println("" + makeSumm(3, 6, "/"));
        Scanner se = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        double x = se.nextDouble();

        System.out.println("Enter 1ast Number: ");
        double y = se.nextDouble();
        System.out.println("Enter Your operator: ");
        se.nextLine();
        String z = se.nextLine();
        double answer = makeSumm(x, y, z);
        System.out.println("Total Result: " + answer);
    }

    public static double makeSumm(double n1, double n2, String str) {
        double rs = 0;
        if (str.equalsIgnoreCase("+")) {
            rs = n1 + n2;
        } else if (str.equalsIgnoreCase("-")) {
            rs = n1 - n2;
        } else if (str.equalsIgnoreCase("*")) {
            rs = n1 * n2;
        } else if (str.equalsIgnoreCase("/")) {
            rs = n1 / n2;
        } else if (str.equalsIgnoreCase("%")) {
            rs = n1 % n2;
        }

        return rs;
    }
}
