package service.serviceImpl;

import dao.UserDao;
import dao.daoImpl.UserDaoImpl;
import models.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(Long id, User newUser) {
         userDao.updateUser(id,newUser);
    }

    @Override
    public String deleteUser(Long id) {
        return userDao.deleteUser(id);
    }
}
