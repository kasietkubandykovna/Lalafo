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
    public void updateUser(Long id, User newUser) {
  DateBase.users.stream().filter(user -> user.getId().equals(id)).findFirst().
       ifPresent(user -> {
              // user.setId(user.getId());
        user.setFirstName(newUser.getFirstName());
    user.setEmail(newUser.getEmail());
    user.setPassword(newUser.getPassword());
    user.setRole(newUser.getRole());
    user.setAnnouncements(newUser.getAnnouncements());
    user.setFavorites(newUser.getFavorites());
          });
    }

    @Override
    public String deleteUser(Long id) {
boolean removed=DateBase.users.removeIf(user -> user.getId().equals(id));
return removed? "deleted successfully":"user not found";
    }
}
