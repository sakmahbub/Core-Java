package Evidence;

import java.util.Scanner;

public class PassWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter at least 7 char password: ");

        String password = sc.nextLine();
        if (password.length() >= 7) {
            System.out.println("Valid");

        } else {
            System.out.println("Not Valid");
        }
    }

}
