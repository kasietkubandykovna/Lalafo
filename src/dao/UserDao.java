package dao;

import models.User;
import myExceptionen.MyExceptionen;

import java.util.List;

public interface UserDao {
    String addUser(User user);
    List<User>getAllUsers();
    User getUserById(Long id) throws MyExceptionen;
    void updateUser(Long id,User newUser);
    String deleteUser(Long id);
}
