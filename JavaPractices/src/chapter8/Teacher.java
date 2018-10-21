package chapter8;

// Setter and Getter based
public class Teacher {

    // step-1: Instance Variable declare
    int id;
    String name;
    String educationQualification;

    // step-2: Set value
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    //step-3: Deafult constructor neya (optional)
    //step-4: Take a main method or any method (optional)
    public static void main(String[] args) {
        //step-5: create object using Deafult constructor
        Teacher teacher = new Teacher();
        //step-6: set value within Teacher
        teacher.setId(2000);
        teacher.setName("Mahbub");
        teacher.setEducationQualification("Masters");
        System.out.println("ID: "+ teacher.getId());
        System.out.println("Name: "+ teacher.getName());
        System.out.println("Edu: " + teacher.getEducationQualification());
    }

    // step-7: generate getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }
    // step-8: print and get value
}
