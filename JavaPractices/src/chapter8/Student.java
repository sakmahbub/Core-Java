package chapter8;

public class Student {

    int ID;
    String Name;

    public Student() {
    }

    /* public Student(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }
    
    public static void main(String[] args) {
        Student st= new Student();
        Student std= new Student(1243838, "Sakil Mahbub");
        System.out.println(std);
    }
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setID(1243838);
        s1.setName("Sakil Mahbub");
        System.out.println(s1);
    }

    public void setID(int ID) {
        this.ID = ID;

    }

    public void setName(String Name) {
        this.Name = Name;

    }

    @Override
    public String toString() {
        return "Student {" + "ID=" + ID + ", Name=" + Name + '}';
    }

}
