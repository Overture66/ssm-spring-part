package com.sc.test;

import com.sc.config.JavaConfig;
import com.sc.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {
    
    @Autowired
    private Calculator calculator;
    
    @Test
    public void test(){
        int add = calculator.add(1, 2);
        System.out.println("add = " + add);
    }
    
}
