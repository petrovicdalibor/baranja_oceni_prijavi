package mk.ukim.finki.wp.baranja_oceni_prijavi.repository;

import mk.ukim.finki.wp.baranja_oceni_prijavi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepostiory extends JpaRepository<Student, String> {
    Optional<Student> findByEmail(String email);
}
