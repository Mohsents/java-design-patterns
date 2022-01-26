package transferobject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    // List is working as a database
    private final List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();
        StudentVO john = new StudentVO("John", 0);
        StudentVO jim = new StudentVO("Jim", 1);
        students.add(john);
        students.add(jim);
    }

    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student with roll no " + student.getRollNo() + " deleted from database.");
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student with roll no " + student.getRollNo() + " updated.");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }
}
