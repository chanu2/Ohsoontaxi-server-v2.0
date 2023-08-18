package ohsoontaxi.backend.domain.user.domain.repository;


import ohsoontaxi.backend.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByOauthIdAndOauthProvider(String oauthId, String oauthProvider);

    Optional<User> findByEmail(String email);
}
