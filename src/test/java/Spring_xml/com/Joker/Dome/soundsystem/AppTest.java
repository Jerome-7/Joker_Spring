package Spring_xml.com.Joker.Dome.soundsystem;

import Spring_xml01.com.Joker.Demo.soundsystem.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joker
 * @Date 2022/11/5 19:18
 * @Description This is description of class
 * @since version-1.0
 */
// 可以自动的初始化Spring上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
// 读取配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {

    @Autowired
    @Qualifier("CompactDisc")
    private CompactDisc CompactDisc2;

    @Test
    public void test01(){

        CompactDisc2.paly();
    }
}
