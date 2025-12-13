package gururaj.studentmanagement.restapi.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import gururaj.studentmanagement.restapi.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}