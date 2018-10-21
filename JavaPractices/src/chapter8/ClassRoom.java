
package chapter8;

public class ClassRoom {
    int id;
    String location;

    public ClassRoom() {
    }

    
    public ClassRoom(int id, String location) {
        this.id = id;
        this.location = location;
    }
    
    public static void main(String[] args) {
        ClassRoom ClassRoom1= new ClassRoom(302, "4th Floor");
        System.out.println("ID: "+ ClassRoom1.getId());
        System.out.println("Location: "+ ClassRoom1.getLocation());
    }
    
    
    
    
    

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
    
    
    
}
