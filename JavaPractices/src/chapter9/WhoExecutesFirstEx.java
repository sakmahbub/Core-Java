package chapter9;

public class WhoExecutesFirstEx {

    public static void main(String[] args) {
        WhoExecutesFirstEx s = new WhoExecutesFirstEx();
        System.out.println("I am main method");

    }

    public WhoExecutesFirstEx() {
        System.out.println("I am from costructor");

    }

    static {
        System.out.println("I am static block");

    }
}
