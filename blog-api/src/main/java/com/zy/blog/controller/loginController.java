package com.zy.blog.controller;


import com.zy.blog.service.LoginService;
import com.zy.blog.vo.Result;
import com.zy.blog.vo.params.LoginParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class loginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParams loginParams){

        return loginService.login(loginParams);
    }
}
