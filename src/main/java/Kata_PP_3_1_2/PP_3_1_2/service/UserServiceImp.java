package Kata_PP_3_1_2.PP_3_1_2.service;

import Kata_PP_3_1_2.PP_3_1_2.DAO.UserDaoImp;
import Kata_PP_3_1_2.PP_3_1_2.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service

public class UserServiceImp implements UserService {

   private UserDaoImp userDaoImp;
    @Autowired
    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Transactional
    @Override
    public void addNewUser(User user) {
        userDaoImp.addNewUser(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }

    @Transactional
    @Override
    public User getUser(int id) {
        return userDaoImp.getUser(id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDaoImp.updateUser(user);
    }
    @Transactional
    @Override
    public void deleteUser(int id) {
        userDaoImp.deleteUser(id);

    }
}
