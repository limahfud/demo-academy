package id.investree.demoacademy.service;

import id.investree.demoacademy.controller.UserController;
import id.investree.demoacademy.model.Gender;
import id.investree.demoacademy.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<User>();

    UserServiceImpl() {
        users.add(new User(1, "Andi", 20, "male", "Bekasi"));
        users.add(new User(2, "Budi", 25, "male", "Tangerang"));
        users.add(new User(3, "Cynthia", 15, "female", "Bekasi"));
        users.add(new User(4, "Danny", 23, "male", "Bogor"));
        users.add(new User(5, "Erika", 2, "female", "Jaksel"));
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public User getUser(Long id) {
        for (User user: users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(Long id, User user) {
        for (User inspectedUser: users) {
            if (id == inspectedUser.getId()) {
                inspectedUser.setName(user.getName());
                inspectedUser.setAge(user.getAge());
                inspectedUser.setGender(user.getGender());
                inspectedUser.setAddress(user.getAddress());

                return inspectedUser;
            }
        }

        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}
