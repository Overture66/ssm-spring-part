package com.sc.test;

import com.sc.config.JavaConfig;
import com.sc.controller.StudentController;
import com.sc.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocJavaTest {
    @Test
    public void test(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController bean = annotationConfigApplicationContext.getBean(StudentController.class);
        bean.findAll();
    }
}
