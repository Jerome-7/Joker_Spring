package Spring_factory.com.Joker.Dome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joker
 * @Date 2022/11/5 21:11
 * @Description This is description of class
 * @since version-1.0
 */
// 可以自动的初始化Spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonFactoryTest {

    @Autowired
    Person person1;

    @Autowired
    Person person2;
    @Test
    public void test01(){
        System.out.println(person1);
        System.out.println(person2);
    }
}
