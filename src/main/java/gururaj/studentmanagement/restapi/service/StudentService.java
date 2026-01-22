package gururaj.studentmanagement.restapi.service;
import java.util.List;
import gururaj.studentmanagement.restapi.model.Student;

public interface StudentService {

    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}