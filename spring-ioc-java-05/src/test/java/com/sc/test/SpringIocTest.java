package com.sc.test;


import com.sc.config.JavaConfiguration;
import com.sc.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIocTest {

    @Test
    public void test_01(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(JavaConfiguration.class);
        StudentController bean = applicationContext.getBean(StudentController.class);
        System.out.println("bean = " + bean);
    }
    @Test
    public void test_02(){
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
    }
}
