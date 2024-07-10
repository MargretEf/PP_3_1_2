package Kata_PP_3_1_2.PP_3_1_2.service;

import Kata_PP_3_1_2.PP_3_1_2.models.User;
import org.springframework.stereotype.Component;


import java.util.List;
@Component
public interface UserService {
    void addNewUser(User user);
    List<User> getAllUsers();
    User getUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
