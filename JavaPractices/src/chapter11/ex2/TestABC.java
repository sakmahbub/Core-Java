package chapter11.ex2;

import chapter11.*;

public class TestABC {

    public static void main(String[] args) {
        B b1 = new B(); // b1 is object and its reference is B class
        A b2 = new B(); // b2 is object and its reference is A class
        A a1 = new A(); // a1 is object and its reference is A class
        //////////BUT....///////////
        ///  B a2 = new A(); /// child can not reference of father

        C c1 = new C();
        B c2 = new C();
        A c3 = new C();
        //////////BUT....///////////
        //   C c4 = new B(); /// child can not reference of father
        //  C c4 = new A(); /// child can not reference of father
        
        
        System.out.println(b1 instanceof B);
        System.out.println(b2 instanceof A);
        System.out.println(a1 instanceof B);
        
        System.out.println(c1 instanceof C);
        System.out.println(c2 instanceof C);
        System.out.println(c3 instanceof B);
        

    }

}
