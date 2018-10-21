package chapter8;
//class is a blue print of object
public class Animal {
    // Animal Object's State
    // Instance variable
    String name;
    String color;
    double age;
    String race;

// Default Constructor has no arguments/parameters
    public Animal() {

    }

    // Argumentative Constructor
    public Animal(String name, String color, double age, String race) {
        // this menas current Instance
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    //Animal Object's Behavior
    void bite() {

    }

    void eat() {
    }

    void sleep() {
    }

    void run() {
    }

    public static void main(String[] args) {
        Animal tom=new Animal();
        //First animal is class name
        //a1 is object name
        //= is operator
        // new is operator for creating object
        //last animal is Constructor
         Animal jerry=new Animal();
         Animal animal500= new Animal("Nova","Gray", 20.5, "Asian");
         System.out.println(animal500);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }
    
    
}
