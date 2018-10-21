package chapter12;

public class ExceptionEx6 {

    public static void main(String[] args) {
        System.out.println("11111111111");
        try {
            System.out.println(10 / 0);
            System.out.println(Integer.parseInt("Ten"));
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
            /*
             System.out.println("You can't divide by zero");
            System.out.println("You can't parse ten, five etc");
            */
           

        }
        System.out.println("I love U");
    }
}
