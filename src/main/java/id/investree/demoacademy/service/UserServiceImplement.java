package id.investree.demoacademy.service;

import id.investree.demoacademy.UserEntity;
import id.investree.demoacademy.model.Gender;
import id.investree.demoacademy.model.User;
import id.investree.demoacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UserServiceImplement")
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        List<UserEntity> userEntities = userRepository.findByAgeLessThan(21);

        List<User> users = new ArrayList<>();
        for (UserEntity entity: userEntities) {
            users.add(new User(
                    entity.getId(),
                    entity.getName(),
                    entity.getAge(),
                    "male".equals(entity.getGender()) ? Gender.MALE : Gender.FEMALE,
                    entity.getAddress()
            ));
        }

        return users;
    }

    @Override
    public User getUser(Long id) {
        if (userRepository.countById(id) == 0) return null;

        UserEntity entity = userRepository.getOne(id);

        entity.setAge(20);
        userRepository.save(entity);

        User user = new User(
                entity.getId(),
                entity.getName(),
                entity.getAge(),
                "male".equals(entity.getGender()) ? Gender.MALE : Gender.FEMALE,
                entity.getAddress()
        );

        return user;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public String deleteUser(String id) {
        return null;
    }
}
