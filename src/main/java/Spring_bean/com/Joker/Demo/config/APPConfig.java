package Spring_bean.com.Joker.Demo.config;

import Spring_bean.com.Joker.Demo.dao.UserDao;
import Spring_bean.com.Joker.Demo.dao.impl.UserDaoNormal;
import Spring_bean.com.Joker.Demo.service.UserService;
import Spring_bean.com.Joker.Demo.service.impl.UserServiceNormal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.security.PublicKey;

/**
 * @author Joker
 * @Date 2022/10/29 0:38
 * @Description This is description of class
 * @since version-1.0
 */
// @Configuration注解可以标识AppConfig为配置类
@Configuration
// @ComponentScan注解可以将所有@Component注解全部扫描并打印
@ComponentScan
public class APPConfig {

    // Bean可以创建并保存UserDaoNormal对象
    @Bean
    public UserDao userDaoNormal(){
        System.out.println("创建UserDao对象");
        return new UserDaoNormal();
    }

    @Bean
    public UserService userServiceNormal(){
        System.out.println("创建UserService对象");
        // 调用userDaoNormal创建一个新的对象
        UserDao userDao = userDaoNormal();
        // UserServiceNormal与userDao进行关联
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }
}
