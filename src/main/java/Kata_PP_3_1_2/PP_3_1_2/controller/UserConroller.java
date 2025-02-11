package Kata_PP_3_1_2.PP_3_1_2.controller;

import Kata_PP_3_1_2.PP_3_1_2.models.User;
import Kata_PP_3_1_2.PP_3_1_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserConroller {

    private UserService userService;
    @Autowired
    public UserConroller(UserService userServiceImp) {
        this.userService = userServiceImp;
    }

    @GetMapping("/")
    public String showAllUsers(Model model) {
    model.addAttribute("users", userService.getAllUsers());
    return "users";
}
    @GetMapping("/show")
    public String showEditUser(Model model, @RequestParam(value = "id") int id) {
        model.addAttribute("showUser", userService.getUser(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String showEditUser(@ModelAttribute("showUser") User user) {
userService.updateUser(user);
return "redirect:/";
    }

    @GetMapping("/remove")
  public String removeUserId (@RequestParam(value = "id") int id, Model model) {
    userService.deleteUser(id);
    return "redirect:/";
    }



@GetMapping("/add")
public String addUser(Model model) {
    model.addAttribute("user", new User());
    return "addUser";
}
@PostMapping("/save")
public String saveUser(@ModelAttribute("user") User user) {
    userService.addNewUser(user);
    return "redirect:/";
}




}
