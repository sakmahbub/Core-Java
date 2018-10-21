package chapter12;

public class ExceptionEx4 {

    public static void main(String[] args) {
        System.out.println("11111111111");
        try {
            System.out.println(10 / 5);
            System.out.println(Integer.parseInt("Ten"));
        } catch (ArithmeticException ae) {
            System.out.println("You can't divide by zero");
       
        } catch (NumberFormatException e) {
            System.out.println("You can't parse ten, five etc");
            System.out.println("2222222222");
        }
        System.out.println("I love U");

    }

}
