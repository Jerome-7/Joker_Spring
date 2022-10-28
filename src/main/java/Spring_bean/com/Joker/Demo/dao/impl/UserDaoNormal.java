package Spring_bean.com.Joker.Demo.dao.impl;

import Spring_bean.com.Joker.Demo.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author Joker
 * @Date 2022/10/29 0:22
 * @Description This is description of class
 * @since version-1.0
 */

// @Component注解将会被@ComponentScan注解所扫描并打印
@Component
// 使用implements实现UserDao（接口）
public class UserDaoNormal implements UserDao {
    @Override
    public void add() {
        System.out.println("添加用户到数据库中...");
    }
}
