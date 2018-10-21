package mahbub;

import java.util.Arrays;
import java.util.Collections;

public class MultiTwoDShort {
    
    public static void main(String[] args) {
        int[][] twoD = {
            {2, 8, 6, 15, 1, 27},
            {1, 5, 9, 10, 12, 3},
          
        };
        
        for (int[] oneD : twoD) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            
        }
        
        System.out.println("\nOneD Acneding //////////");
        int[] a = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        Arrays.sort(a);
        
        for (int b : a) {
            System.out.print(b + " ");
            
        }
        
        System.out.println("\nOneD desending//////////");
        int[] k = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        Arrays.sort(k);
        
        for (int i = k.length - 1; i >= 0; i--) {
            System.out.print(k[i] + " ");
            
        }
        
        System.out.println("\nOneD desending//////////");
        Integer [] m = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        Arrays.sort(m);
        Collections.reverse(Arrays.asList(m));
        System.out.println(Arrays.toString(m)+" ");
        
    }
}
