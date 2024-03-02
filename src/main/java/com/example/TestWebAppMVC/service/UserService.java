package com.example.TestWebAppMVC.service;

import com.example.TestWebAppMVC.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }
    public  List<User> fiendAll(){
        return users;
    }
}
