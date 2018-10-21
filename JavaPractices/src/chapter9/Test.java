package chapter9;

public class Test {

    public static void main(String[] args) {
        EncapsulatedObject obj = new EncapsulatedObject();
       //  id = 200;  // not access
        // obj.ID = 500;  //not access
        // obj.mayCar(); //not access
        obj.mayPlane();
        obj.mayCycle();
    }

}
