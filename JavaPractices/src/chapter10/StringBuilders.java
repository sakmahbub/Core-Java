package chapter10;

public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder();
        sbr.append("Welcome");
        sbr.append(" ");
        sbr.append("To");
        sbr.append(" ");
        sbr.append("Java");

        System.out.println(sbr);
        System.out.println(sbr.delete(8, 11));
        System.out.println(sbr.deleteCharAt(8));
        
        System.out.println(sbr.replace(11, 100, " HTML"));
        sbr.setCharAt(0, 'M');
        System.out.println(sbr);
        System.out.println(sbr.reverse());

    }

}
