package chapter7;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] x = {8, 9, 4, 1, 6, 7, 5, 11, 48, 21, 48};
        Arrays.sort(x);
        ArrayAsMethodArguments.displayArray(x);

        for (int i : x) {
            System.out.print(i + " ");

        }
        System.out.println("");
    }

}
