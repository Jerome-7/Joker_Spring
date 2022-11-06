package Spring_bean_scope.com.Joker.Dome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joker
 * @Date 2022/11/5 19:57
 * @Description 1、无论是否主动获取或注入bean对象，加载spring上下文就会自动创建bean对象
 * 2、无论获取多少次，拿到的都是同一个对象
 * @since version-1.0
 */
// 可以自动的初始化Spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration(classes = AppConfig.class)
public class Notepad3Test {

    @Autowired
    private Notepad3 notepad1;

//    @Autowired
//    private Notepad3 notepad2;

    @Test
    public void test01(){
        // System.out.println(notepad1 == notepad2);
    }


}
