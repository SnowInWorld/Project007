package com.snow.project.project007_git.controller;

import com.snow.project.project007_git.utils.DateTool;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

@RequestMapping("/main")
@RestController
public class MainController {

    @RequestMapping(value = "/home")
    public String home(HttpServletRequest request){
        String msg="Hello World!"+" "+ DateTool.getLocalTime();
        return msg;
    }
}
