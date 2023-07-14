package accessmodifiers.collage;

import accessmodifiers.Student;

public class Collage {
    void getStudent(){
      Student student = new Student();
        // student.show(); // default method accessible within a pkg only
    }
}
