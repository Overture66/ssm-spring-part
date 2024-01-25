package com.sc.test;

import com.sc.ioc_01.XxxController;
import com.sc.ioc_02.JavaBean;
import com.sc.ioc_03.Controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    @Test
    public void test_ioc_01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("spring-01.xml");
        XxxController xxxController = classPathXmlApplicationContext.getBean(XxxController.class);
        System.out.println("xxxController = " + xxxController);
        Object component = classPathXmlApplicationContext.getBean("commonComponent");
        System.out.println("component = " + component);
    }
    @Test
    public void test_ioc_02(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        JavaBean bean1 = classPathXmlApplicationContext.getBean(JavaBean.class);
        JavaBean bean2 = classPathXmlApplicationContext.getBean(JavaBean.class);
        System.out.println(bean1==bean2);
        classPathXmlApplicationContext.close();
    }
    @Test
    public void test_ioc_03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
        UserController bean = classPathXmlApplicationContext.getBean(UserController.class);
        bean.show();
    }
    @Test
    public void test_ioc_04(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-04.xml");
        com.sc.ioc_04.JavaBean bean = classPathXmlApplicationContext.getBean(com.sc.ioc_04.JavaBean.class);
        System.out.println("bean = " + bean);
    }
}
