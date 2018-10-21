package chapter10;

public class Bike {

    private String color;
    private String maxSpeed;

    

    public void bikeInfo() {
        System.out.println("Bike color: " + color + "\nMax Speed: " + maxSpeed);

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
