package chapter11;


/*
B class is inherting A calss, so 
A is super class and B is sub class
A is parent class and B is child class
 */
public class B extends A {

    double salary;

    public B() {
    }

   

    public B(double salary, int id, String name, String color) {
        super(id, name, color);
        this.salary = salary;
    }

}
