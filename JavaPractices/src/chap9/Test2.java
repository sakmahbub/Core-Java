package chap9;

import chapter9.Student;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "MAhbub");
        Student s2 = new Student(2, "Sakil");
        Student s3 = new Student(3, "Nazmul");
        Student s4 = new Student(4, "Mortoza");
      
        List<Student> Students = new ArrayList();
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Students.add(s4);
        Students.add(new Student(5, "Kajol"));
        Students.add(new Student(6, "Rubel"));
        Students.add(new Student(7, "Muni"));
        Students.add(new Student(8, "Rased"));
        Students.add(new Student(9, "Mostafi"));
        Students.add(new Student(10, "Ruhul"));
        Students.add(new Student(11, "Rafik"));
                
        
        
        for(Student s : Students){
            System.out.println("SI NO: "+ s);
        
        
        }
        
        
        

    }

}
