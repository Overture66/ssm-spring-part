package com.sc.ioc_03.Controller;


import com.sc.ioc_03.Serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    public void show(){
        String show = userService.show();
        System.out.println("show = " + show);
    }
}
