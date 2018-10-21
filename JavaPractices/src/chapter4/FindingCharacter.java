
package chapter4;

public class FindingCharacter {
    public static void main(String[] args) {
         String cc = "Bangladesh";
         System.out.println(cc.indexOf("a"));
         System.out.println(cc.indexOf("a", 3));
         System.out.println(cc.indexOf("a", 1));
         System.out.println(cc.lastIndexOf("a"));
         System.out.println(cc.lastIndexOf("a",4));
    }
}
