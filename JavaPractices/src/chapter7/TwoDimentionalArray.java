package chapter7;

public class TwoDimentionalArray {

    public static void main(String[] args) {
        //  int x[] = {10, 20, 30, 40};
        ///  int y[] = {5, 15, 25, 35};

        int twoD[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {20, 25, 65, 75}
        };

        for (int[] oneD : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("twoD[1][2]: " + twoD[1][2]);
        System.out.println("twoD[2][3]: " + twoD[2][3]);

        /////another twoD///////////
        String two1D[][] = {
            {"*"},
            {"*", "*"},
            {"*", "*", "*"},
            {"*", "*", "*", "*"}
        };

        for (String[] one1D : two1D) {
            for (String j : one1D) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }

}
