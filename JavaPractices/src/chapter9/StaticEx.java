package chapter9;

public class StaticEx {

    static int x = 10;

    public static void main(String[] args) {
        x = 15;

        display();
        StaticEx.display();
        StaticEx s = new StaticEx();
        s.display2();

    }

    public static int display() {
        return 10;
    }

    public void display2() {
        System.out.println("Hi.......");
    }

}
