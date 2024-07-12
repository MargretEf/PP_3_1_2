package Kata_PP_3_1_2.PP_3_1_2.service;

import Kata_PP_3_1_2.PP_3_1_2.DAO.UserDao;
import Kata_PP_3_1_2.PP_3_1_2.DAO.UserDaoImp;
import Kata_PP_3_1_2.PP_3_1_2.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service

public class UserServiceImp implements UserService {

   private UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addNewUser(User user) {
        userDao.addNewUser(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional
    @Override
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }
}
