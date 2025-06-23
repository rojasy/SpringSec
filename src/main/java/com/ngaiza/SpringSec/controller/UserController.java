package com.ngaiza.SpringSec.controller;

import com.ngaiza.SpringSec.model.UserAccounts;
import com.ngaiza.SpringSec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserAccounts register(@RequestBody UserAccounts user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserAccounts user) {
        return userService.verify(user);
    }

}
