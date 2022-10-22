package Speing_interface.com.Joker.Dome.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joker
 * @Date 2022/10/22 18:14
 * @Description This is description of class
 * @since version-1.0
 */
// 可以自动的初始化Spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {
    // 自动注入player
    @Autowired(required = true)
    private UserService userService;

    // @Test注解可以进行单元测试
    @Test
    public void testAdd() {
        userService.add();
    }
}

