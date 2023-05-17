package mk.ukim.finki.wp.baranja_oceni_prijavi.repository;

import mk.ukim.finki.wp.baranja_oceni_prijavi.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, String> {
}
