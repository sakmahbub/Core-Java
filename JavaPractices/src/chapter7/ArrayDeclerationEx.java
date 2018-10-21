package chapter7;

public class ArrayDeclerationEx {
    // array Index starts from 0 zero.
    //Array is fixed in size
    //Array performance is good

    int[] x = new int[2];
    //int []y=new int[3]; // not good
    int z[] = new int[5];

    public static void main(String[] args) {
        int[] x = new int[2];
        x[0] = 10;
        x[1] = 25;

        System.out.println("x[0]: " + x[0]);
        System.out.println("x[1]: " + x[1]);

        // System.out.println("x[2]: " + x[2]); // wrong
        for (int i : x) {
            System.out.println(i);

        }
        // way-2 array dec;eration
        int p[] = {10, 25, 23, 14, 32, 14, 91, 105}; //length 8, index 7
        System.out.println("Length of p: " + p.length);
        System.out.println("p[5]: " + p[5]);
        
      //  p = new int[9];

        for (int j : p) {
            System.out.println(j);
        }

    }

}
