package Kata_PP_3_1_2.PP_3_1_2.DAO;




import Kata_PP_3_1_2.PP_3_1_2.models.User;


import java.util.List;
public interface UserDao {
   void addNewUser(User user);
   List<User> getAllUsers();
   User getUser(int id);
   void updateUser(User user);
   void deleteUser(int id);
}
