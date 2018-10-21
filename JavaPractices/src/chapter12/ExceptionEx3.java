package chapter12;

public class ExceptionEx3 {

    public static void main(String[] args) {
        System.out.println("11111111111");
        try {
            System.out.println(10 / 0);

        } catch (Exception e) {
            System.out.println("You can't divide by zero");
        }
        System.out.println("2222222222");
        try {
            System.out.println(Integer.parseInt("Ten"));
        } catch (Exception e) {
            System.out.println("You can't parse ten, five etc");
        }

    }

}
