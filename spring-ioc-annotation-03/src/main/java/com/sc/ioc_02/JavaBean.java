package com.sc.ioc_02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class JavaBean {


/*
* 周期方法必须public void ()
* */
    @PostConstruct
    public void init(){
        System.out.println("JavaBean.init");
    }

    @PreDestroy
    public void destory(){
        System.out.println("JavaBean.destory");
    }
}
