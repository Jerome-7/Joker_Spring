package Spring_bean.com.Joker.Demo.service.impl;

import Spring_bean.com.Joker.Demo.dao.UserDao;
import Spring_bean.com.Joker.Demo.service.UserService;

/**
 * @author Joker
 * @Date 2022/10/29 1:13
 * @Description This is description of class
 * @since version-1.0
 */
// 使用implements实现UserService（接口）
public class UserServiceNormal implements UserService {

    private UserDao userDao;

    // 创建一个无参函数
    public UserServiceNormal() {
        super();
    }

    // 创建一个有参函数
    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    // 通过setter方法依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        userDao.add();
    }
}
