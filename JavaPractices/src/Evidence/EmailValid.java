package Evidence;

import java.util.*;

public class EmailValid {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Email: ");

        String email = s.nextLine();
        int at = email.indexOf("@");
        int dot = email.indexOf(".");

        if (at > 0 && dot < email.length() - 2 && at < dot - 1) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }

    }
}
