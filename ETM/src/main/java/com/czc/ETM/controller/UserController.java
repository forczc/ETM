package com.czc.ETM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czc.ETM.model.User;
import com.czc.ETM.service.UserService;


@Controller
public class UserController {
	@Autowired
    private UserService userService;

	/*
     *  http://localhost:8080/getUserInfo
     */
 
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getAllUserList();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
        }
        return user;
    }
    
    /**
     * 
     * @param map
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "visit/login";  
    }

    @RequestMapping("/index")
    public String index() {
        return "visit/index";  
    }
}
