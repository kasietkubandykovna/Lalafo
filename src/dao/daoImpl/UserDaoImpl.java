package dao.daoImpl;

import dao.UserDao;
import datebase.DateBase;
import models.User;
import myExceptionen.MyExceptionen;

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
    public User getUserById(Long id) throws MyExceptionen {
        try {


            return DateBase.users.stream()
                    .filter(user -> user.getId().equals(id))
                    .findFirst().orElseThrow(() -> new MyExceptionen("User with ID " + id + " not found"));
        }catch (MyExceptionen e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updateUser(Long id, User newUser) {
  DateBase.users.stream().filter(user -> user.getId().equals(id)).findFirst().
       ifPresent(user -> {
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
