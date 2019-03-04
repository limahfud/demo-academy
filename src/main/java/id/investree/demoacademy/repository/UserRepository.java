package id.investree.demoacademy.repository;

import id.investree.demoacademy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findByAgeBetween(int start, int end);
}
