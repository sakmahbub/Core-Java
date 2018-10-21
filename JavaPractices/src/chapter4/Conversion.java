
package chapter4;


public class Conversion {
    public static void main(String[] args) {
        String ss = "10";
        int i = Integer.valueOf(ss);
        System.out.println("I : " + i);
        
        double salary = 50000.0;
        String sal = String.valueOf(salary);
        
        long salLong = Long.valueOf(ss);
        boolean bool = true;
        String boo = String.valueOf(bool);
        char ch = 'A';
        String st =String.valueOf(ch);
    }
    
}
