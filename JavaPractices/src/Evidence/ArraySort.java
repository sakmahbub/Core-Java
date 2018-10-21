package Evidence;

import java.util.Arrays;
import java.util.Collections;
import javafx.print.Collation;

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 6, 9};
        for (int i : arr) {
            System.out.print(i + " ");

        }
        //////////way-2///////////////
        System.out.println("\nSorter array or Assending Order");

        int[] a = {4, 2, 1, 8, 6, 9};
        Arrays.sort(a);
        for (int j : a) {
            System.out.print(j + " ");

        }
        //////////way-3///////////////
        System.out.println("\nArray decending Order");
        int[] b = {4, 2, 1, 8, 6, 9};
        Arrays.sort(b);
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");

        }
        //////////way-4///////////////
        System.out.println("\nArray decending Order using reverse");

        Integer [] c = {4, 2, 1, 8, 6, 9};
        Arrays.sort(c);
        Collections.reverse(Arrays.asList(c));
        System.out.println("Modifies array: " + Arrays.toString(c));
    }

}
