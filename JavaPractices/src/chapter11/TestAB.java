
package chapter11;


public class TestAB {
    public static void main(String[] args) {
        B b1= new B(); // b1 is object and its reference is B class
        A b2= new B(); // b2 is object and its reference is A class
        A a1= new A(); // a1 is object and its reference is A class
        //////////BUT....///////////
      ///  B a2 = new A(); /// child can not reference of father
        
    }
    
}
