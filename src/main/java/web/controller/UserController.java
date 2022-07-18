package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.models.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String users(Model model) {

        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }




}
