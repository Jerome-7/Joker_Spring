package Spring_bean.com.Joker.Demo.dao;

import Speing_interface.com.Joker.Dome.service.AppConfig;
import Spring_bean.com.Joker.Demo.config.APPConfig;
import Spring_bean.com.Joker.Demo.dao.impl.UserDaoNormal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joker
 * @Date 2022/10/29 0:53
 * @Description This is description of class
 * @since version-1.0
 */
// 可以自动的初始化Spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration(classes = APPConfig.class)
public class UserDaoTest {

    // @Autowired可以自动注入@Bean里的对象
    @Autowired
    private UserDao userDao;

    // @Test注解可以进行单元测试
    @Test
    public void testAdd(){
        userDao.add();
    }
}
