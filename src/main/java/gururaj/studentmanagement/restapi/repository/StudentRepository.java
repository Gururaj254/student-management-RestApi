package gururaj.studentmanagement.restapi.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import gururaj.studentmanagement.restapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}