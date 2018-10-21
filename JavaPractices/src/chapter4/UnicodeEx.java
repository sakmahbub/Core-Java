package chapter4;

public class UnicodeEx {

    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("The latter is: " + ++ch);

        char ch1 = (char) 65.25;
        System.out.println("The Char is: " + ch1);

        int j = (int) 'A';
        System.out.println("The int number: " + j);

        for (int i = 0; i < 26; i++) {
            System.out.println(ch++);

        }

        long x = 10;
        int y = (int) x;
        
        System.out.println("X: "+y);
        
        
        String name = "I love Bangla";
        System.out.println("Total length: " + name.length());
        System.out.println("Index :" + name.charAt(10));
        
        
        String name2 = "DESH";
        System.out.println("Concat :" + name.concat(name2).toLowerCase());
        System.out.println(name2.trim());
        
        
        String name3 = "Sakil Mahbub ";
        for(int m = 0; m< name3.length(); m++){
            System.out.print(name3.charAt(m)+ " ");
        }

    }

}
