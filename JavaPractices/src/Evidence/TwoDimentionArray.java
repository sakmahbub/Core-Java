package Evidence;

public class TwoDimentionArray {

    public static void main(String[] args) {
        int twoD[][] = {
            {2, 4, 6, 8}, {3, 5, 7, 9}
        };
        int sum = 0;

        for (int[] OneD : twoD) {
            for (int i : OneD) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println();

        }
        System.out.println("Sum: " + sum);
    }

}
