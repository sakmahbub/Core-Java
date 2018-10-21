
package chapter4;

public class StringCompaire {
    public static void main(String[] args) {
        String str1 = "Bangladesh";
        String str2 = "BangLadesh";
        if(str1 == str2){
            System.out.println("True");
        
        }else{
            System.out.println("False");
        
        }
        
        // way -2
        
        
        if(str1.equalsIgnoreCase(str2)){
        
            System.out.println("True");
            
        }else{
            System.out.println("False");
        
        }
        
        
        //////////////////////compaire2222//////////////
        
        String s1 = "Sakil";
        String s2 = "Mahbub";
        if(s1.compareTo(s2) < 0){
            System.out.println("S1 Less than S2");
        
        }else  if(s1.compareTo(s2) > 0){
            System.out.println("S1 Greater than S2");
       
        }else  if(s1.compareTo(s2) == 0){
            System.out.println("S1 equal to S2");
        
        }
    }
}
