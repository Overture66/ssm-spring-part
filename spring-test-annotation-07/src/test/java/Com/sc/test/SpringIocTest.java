package Com.sc.test;

import com.sc.config.JavaConfiguration;
import com.sc.config.com.sc.A;
import com.sc.config.com.sc.B;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaConfiguration.class)
public class SpringIocTest {

    @Autowired
    private A a;
    @Autowired
    private B b;
    @Test
    public void test(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
