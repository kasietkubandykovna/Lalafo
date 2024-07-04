package service;

import models.User;

import java.util.List;

public interface UserService {
    String addUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    void updateUser(Long id,User newUser);
    String deleteUser(Long id);
}
