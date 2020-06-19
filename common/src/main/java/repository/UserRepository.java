package repository;

import domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author accountw
 * @date 2020-06-17 16:56
 * @description:
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
}
