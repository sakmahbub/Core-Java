package Evidence;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        System.out.println("Enter number length: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter the n number: ");
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);

        System.out.println("Min : " + arr[0] + " Max: " + arr[arr.length - 1]);

    }
}
