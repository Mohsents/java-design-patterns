package dao;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNum);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
