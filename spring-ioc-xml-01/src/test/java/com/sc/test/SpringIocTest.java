package com.sc.test;

import com.sc.ioc_03.HappyComponent;
import com.sc.ioc_04.JavaBean;
import com.sc.ioc_05.JavaBeanFactoryBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {
/*
*讲解如何创建ioc容器并且读取配置文件
*/
    public void createIoc(){
        /*
        * 直接创建容器读取配置文件
        * */
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-03.xml");

    }
    /*
    * 讲解如何在Ioc容器中获取组件bean
    * */
    @Test
    public void getBeanFromIoc(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-03.xml");

        HappyComponent happyComponent1 = (HappyComponent) applicationContext.getBean("happyComponent");

        HappyComponent happyComponent2 = applicationContext.getBean("happyComponent",HappyComponent.class);

        HappyComponent happyComponent3 = applicationContext.getBean(HappyComponent.class);

        happyComponent1.doWork();

        System.out.println(happyComponent1==happyComponent2);

        System.out.println(happyComponent2==happyComponent3);


    }
    @Test
    public void test_04(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-04.xml");
        JavaBean javaBean1 = applicationContext.getBean("javaBean", JavaBean.class);
        JavaBean javaBean2 = applicationContext.getBean("javaBean", JavaBean.class);
        System.out.println(javaBean1==javaBean2);

    }
    @Test
    public void test_05(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-05.xml");
        com.sc.ioc_05.JavaBean javaBean = applicationContext.getBean("javaBean", com.sc.ioc_05.JavaBean.class);

        System.out.println("javaBean = " + javaBean);

        //TODO:FactoryBean工厂也会加入到ioc容器！名字 &id
        Object bean = applicationContext.getBean("&javaBean");
        System.out.println("bean = " + bean);

    }
}
