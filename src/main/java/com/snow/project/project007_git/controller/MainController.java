package com.snow.project.project007_git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/main")
@RestController
public class MainController {

    @RequestMapping(value = "/home")
    public String home(HttpServletRequest request){
        String msg="Hello World!";
        return msg;
    }
}
