package id.investree.demoacademy.service;

import id.investree.demoacademy.model.User;
import id.investree.demoacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImplement")
public class UserServiceImplement implements UserService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findByAgeBetween(19, 24);
    }

    @Override
    public User getUser(Long id) {
        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        userRepository.save(user);

        return user;
    }

    @Override
    public User updateUser(Long id, User user) {
        if (userRepository.findById(id).isPresent()) {
            User userUpdated = userRepository.findById(id).get();


            userUpdated.setName(user.getName());
            userUpdated.setAge(user.getAge());
            userUpdated.setGender(user.getGender());
            userUpdated.setAddress(user.getAddress());

            userRepository.save(userUpdated);

            return userUpdated;
        }

        return user;
    }

    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);

        return "Success";
    }
}
