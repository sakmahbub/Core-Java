
package chapter9;


public  class Student {
    
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
   
    public Student displayDetails(){
    Student s= new Student(100, "Sakil");
    return s;
    }
}
