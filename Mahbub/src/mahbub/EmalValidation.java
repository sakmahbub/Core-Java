package mahbub;

import java.util.Scanner;

public class EmalValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address: ");

        String email = sc.nextLine();
        int dot = email.indexOf(".");
        int at = email.indexOf("@");

        if (at > 0 && dot < email.length() - 2 && at < dot - 1) {
            System.out.println("Email is valid");

        } else {
            System.out.println("Email is Invalid");
        }
    }

}
