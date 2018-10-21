
package chapter7;


public class ArrayAsMethodArguments {
    public static void main(String[] args) {
        int x[]= {3, 40, 15, 20};
        displayArray(x);
        transferArray(x);
        displayArray(transferArray(x));
    }
    
    public static void displayArray(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        
        
        }
        System.out.println("");
    }
    
     public static int[] transferArray(int[] sourceArray){
    int [] tergetArray = new int[sourceArray.length];
         System.arraycopy(sourceArray, 0, tergetArray, 0, sourceArray.length);
         return tergetArray;
    
    }
    
   
 
}
