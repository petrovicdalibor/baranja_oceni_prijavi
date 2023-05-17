package mk.ukim.finki.wp.baranja_oceni_prijavi.repository;

import mk.ukim.finki.wp.baranja_oceni_prijavi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
