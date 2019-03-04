package id.investree.demoacademy.controller;

import id.investree.demoacademy.model.User;
import id.investree.demoacademy.service.UserService;
import id.investree.demoacademy.service.UserServiceImpl;
import id.investree.demoacademy.service.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController  {

    private UserService userService;

    @Autowired
    public UserController(@Qualifier("UserServiceImplement") UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @PostMapping
    public User postUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public User putUser(@PathVariable("id") Long id,
                        @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping
    public String deleteUser(Long id) {
        userService.deleteUser(id);
        return "Success";
    }

}
