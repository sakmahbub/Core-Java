package chapter11.ex3;

public class TestAB {

    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        A b2 = new B();
        
        ///////New call Method//////////
        a.sayHello();
        b1.sayHello();
        b1.sayHi();
        b2.sayHello();
        
    }

}
