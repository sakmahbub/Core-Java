package chapter5;

public class whileSum {

    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 10) {
            System.out.println("Sum number: " + i);
            sum += i;
            i++;

        }
        System.out.println("Total sum is: " + sum);
    }

}
