package chapter10;

public class PlindomEx {

    public static void main(String[] args) {
        // System.out.println(isPlindom("mom"));

        String[] arrs = {"mom", "abc", "madam", "wow", "mim", "eye", "bye"};
        System.out.println(countPalindom(arrs));

        String s1 = "mom";
        String s2 = "Mom";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("True");
        } else {

            System.out.println("False");
        }
    }

    public static boolean isPlindom(String s) {

        StringBuilder str = new StringBuilder(s);
        String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(s)) {
            return true;

        }
        return false;
    }

    public static int countPalindom(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPlindom(s[i])) {
                counter++;
            }

        }
        return counter;
    }

}
