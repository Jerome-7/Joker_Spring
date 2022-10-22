package Sping_wiring_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Joker
 * @Date 2022/10/19 21:13
 * @Description 打印机
 * @since version-1.0
 */
// @Component注解将会被@ComponentScan注解所扫描并打印
@Component
public class CDplayer {
// 创建一个成员变量
    private CompactDisc cd;

    public CDplayer(){
        super();
        System.out.println("CDplayer无参构造函数");
    }
    // @Autowired可以自动调用CDplayer的构造函数，对cd这个成员变量进行依赖注入
@Autowired
    public CDplayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDplayer有参构造函数");
    }
    public void play(){
        cd.play();
    }
}
