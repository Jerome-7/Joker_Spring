package Spring_bean.com.Joker.Demo.service;

import Spring_bean.com.Joker.Demo.config.APPConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joker
 * @Date 2022/10/29 1:49
 * @Description This is description of class
 * @since version-1.0
 */
// 可以自动的初始化Spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration(classes = APPConfig.class)
public class UserServiceTest {

    // @Autowired可以自动注入@Bean里的对象
    @Autowired
    private UserService userService;


    // @Test注解可以进行单元测试
    @Test
    public void testAdd(){
        userService.add();
    }
}
