package com.sc.jdbc;

import com.sc.controller.StudentController;
import com.sc.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentSystemTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-02.xml");
        StudentController studentService = classPathXmlApplicationContext.getBean("studentController", StudentController.class);
        studentService.findAll();
        classPathXmlApplicationContext.close();

    }
}
