
package chapter9;

public class EncapsulatedObject {
    private static  int ID;
    private static  String name;
    
    public EncapsulatedObject(){
    
    }
    
    public static void main(String[] args) {
       EncapsulatedObject obj = new EncapsulatedObject(); 
       ID=200;
       obj.mayCar();
       obj.ID =500;
        System.out.println("ID: " +obj.ID);
        obj.mayCycle();
        
    }
    
    private void mayCar(){
        System.out.println("My car is privet");
    }
    
     public void mayPlane(){
        System.out.println("My Plane is public");
    }
     
     protected void mayCycle(){
        System.out.println("My cycle is protected");
    }
     
}
