
package chapter8;

public class AnimalDog {
    int no;
    String name;
    double age;
    String color;
    String race;
    
    public static void main(String[] args) {
        AnimalDog dog = new AnimalDog();
        dog.setNo(10);
        dog.setName("Kalu");
        dog.setAge(20.5);
        dog.setColor("Black");
        dog.setRace("India");
        System.out.println("NO: " + dog.getNo());
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Race: " + dog.getRace());
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
    
    
    
}
