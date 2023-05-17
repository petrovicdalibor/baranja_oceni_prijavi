package mk.ukim.finki.wp.baranja_oceni_prijavi.repository;

import mk.ukim.finki.wp.baranja_oceni_prijavi.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
}
