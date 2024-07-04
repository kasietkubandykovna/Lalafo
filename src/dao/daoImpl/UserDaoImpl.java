package dao.daoImpl;

import dao.UserDao;
import datebase.DateBase;
import models.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public String addUser(User user) {
        DateBase.users.add(user);
        return "added successfully";
    }

    @Override
    public List<User> getAllUsers() {
        return DateBase.users;
    }

    @Override
    public User getUserById(Long id) {
      return DateBase.users.stream()
              .filter(user -> user.getId().equals(id))
              .findFirst().orElse(null);

    }

    @Override
    public User updateUser(Long id, String newUser) {
        User user=getUserById(id);
        if (user!=null){
        user.setFirstName(newUser);
        return user;
    }return null;
    }

    @Override
    public String deleteUser(Long id) {
boolean removed=DateBase.users.removeIf(user -> user.getId().equals(id));
return removed? "deleted successfully":"user not found";
    }
}
