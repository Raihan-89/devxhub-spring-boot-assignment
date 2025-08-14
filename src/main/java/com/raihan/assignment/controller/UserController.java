package com.raihan.assignment.controller;

import com.raihan.assignment.model.Users;
import com.raihan.assignment.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/public")
    public String publicEndpoint(){
        return "This is a public endpoint";
    }

    @GetMapping("/user")
    public String userEndpoint(){
        return "This is a user endpoint";
    }

    @GetMapping("/admin")
    public String adminEndpoint(){
        return "This is a admin endpoint";
    }

    @PostMapping("/users")
    public Users addUserEndpoint(@RequestBody Users user) throws Exception{
        return userService.addUser(user);
    }
}
