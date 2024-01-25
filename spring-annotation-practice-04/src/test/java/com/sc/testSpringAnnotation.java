package com.sc;

import com.sc.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringAnnotation {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        StudentController bean = classPathXmlApplicationContext.getBean(StudentController.class);
        bean.findAll();
        System.out.println("bean = " + bean);
    }
}
