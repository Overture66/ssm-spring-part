package com.sc.ioc_03.Serivce.Impl;

import com.sc.ioc_03.Serivce.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String show() {
        return "Service run...";
    }
}
