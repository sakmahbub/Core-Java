package chapter3;

public class Sum {

    public static void main(String[] args) {

        int i;

        int sum = 0;

        for (i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("The sum is: " + i);

        }
        System.out.println("The total sum of: " + sum);

    }

}
