package id.investree.demoacademy.service;

import id.investree.demoacademy.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    User getUser(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    String deleteUser(String id);

}
