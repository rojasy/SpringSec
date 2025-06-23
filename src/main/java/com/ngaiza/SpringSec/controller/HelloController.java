package com.ngaiza.SpringSec.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(HttpServletRequest request) {
        return "Hello Ngaiza " + request.getSession().getId() ;
    }
}
