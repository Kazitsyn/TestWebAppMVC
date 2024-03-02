package com.example.TestWebAppMVC.controller;

import com.example.TestWebAppMVC.model.User;
import com.example.TestWebAppMVC.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@Log
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public String viewUser(Model model){
        List<User> userList = userService.fiendAll();
        model.addAttribute("users", userList);
        return "users";
    }
    @PostMapping("/users")
    public String addUser(User user, Model model){
        userService.addUser(user);
        List<User> userList = userService.fiendAll();
        model.addAttribute("users", userList);
        return "users";
    }
}
