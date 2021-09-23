package com.user.controller;

import com.user.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @RequestMapping("/index")
    public String hello(){
        return "hello world!";
    }
    @GetMapping("/test")
    public String test(){
        return "getMethod";
    }
    @PostMapping("/post")
    public String post(){
        return "post Method";
    }
}
