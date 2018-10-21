package chapter7;

public class SingleDimentionalArray {

    public static void main(String[] args) {
        // Single Dimentional Array, One [] sign

        int p[] = {10, 25, 23, 14, 32, 14, 91, 105}; //length 8, index 7
        System.out.println("Length of p: " + p.length);
        System.out.println("p[5]: " + p[5]);
        for (int j : p) {
            System.out.print(j + " ");
        }
        System.out.println();
        // another Single Dimentional Array
        int q[] = {40, 55, 58, 61, 53, 73, 83, 115};
        for (int k : q) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

}
