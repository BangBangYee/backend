package bbangbbangz.baby_monitoring_system.repository;

import bbangbbangz.baby_monitoring_system.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String username);
}
