package com.sc.ioc_04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaBean {
    @Value("${jdbc.username}:admin")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Override
    public String toString() {
        return "JavaBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
