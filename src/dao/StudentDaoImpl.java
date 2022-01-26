package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private final List<Student> students;

    public StudentDaoImpl() {
        Student student1 = new Student("Mohsen", 0);
        Student student2 = new Student("Abdullah", 1);
        students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNum) {
        if (isRollNumValid(rollNum)) {
            return students.get(rollNum);
        } else {
            return null;
        }
    }

    @Override
    public void updateStudent(Student student) {
        if (isRollNumValid(student.getRollNo())) {
            students.get(student.getRollNo()).setName(student.getName());
            System.out.println("Student name successfully updated to " + student.getName());
        }
    }

    @Override
    public void deleteStudent(Student student) {
        if (isRollNumValid(student.getRollNo())) {
            students.remove(student.getRollNo());
            System.out.println("Student with name " + student.getName() + " successfully deleted.");
        }
    }

    private boolean isRollNumValid(int rollNum) {
        if (rollNum >= students.size()) {
            System.out.println("No student with rollNum " + rollNum);
            return false;
        } else {
            return true;
        }
    }
}
