package chapter12;

public class ExceptionEx2 {

    public static void main(String[] args) {

        try {
            System.out.println(getDivision(10, 0));
        } catch (Exception e) {
            System.out.println("Hiiiiiiiiiii");
        }
        System.out.println("Helloooooooooo");
        System.out.println(getParseString("Ten"));
    }

    //Baring chiti style, reciver will (pay)/ handle Exception
    public static int getDivision(int x, int y) throws ArithmeticException {

        int rs = x / y;
        return rs;
    }

    // Q. string value like "1", "10", "90", "500" k int e transfer korbo how?
    /*
    Explanation =  input: string and output: int
    output hobe method er data type , input hobe 
    
     */
    public static int getParseString(String str) {
        int rs = 0;
        try {
            rs = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("You can not pass Srting like ten , five etc");
        }

        return rs;

    }
}
