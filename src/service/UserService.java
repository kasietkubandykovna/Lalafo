package service;

import models.User;

import java.util.List;

public interface UserService {
    String addUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id,String newUser);
    String deleteUser(Long id);
}
