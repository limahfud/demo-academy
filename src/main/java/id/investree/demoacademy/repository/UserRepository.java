package id.investree.demoacademy.repository;

import id.investree.demoacademy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    public List<UserEntity> findByAgeLessThan(Integer i);

    public Long countById(Long id);
}
