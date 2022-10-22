package Speing_interface.com.Joker.Dome.service.impl;

import Speing_interface.com.Joker.Dome.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author Joker
 * @Date 2022/10/22 18:05
 * @Description This is description of class
 * @since version-1.0
 */
// @Component注解将会被@ComponentScan注解所扫描并打印
@Component
// @Primary可以首选bean
// @Qualifier("别名")可以指定使用这个别名的注解
public class UserServiceNormal implements UserService {

    @Override
    public void add() {
        System.out.println("添加用户");
    }
}
