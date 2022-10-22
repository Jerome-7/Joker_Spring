package Sping_wiring_auto;

import org.springframework.stereotype.Component;

/**
 * @author Joker
 * @Date 2022/10/19 21:02
 * @Description 打印服务
 * @since version-1.0
 */
// @Component注解将会被@ComponentScan注解所扫描并打印
@Component
public class CompactDisc {

    public CompactDisc(){
        super();
        System.out.println("CompactDisc无参构造函数");
    }

    public void play(){
        System.out.println("正在播放音乐......");
    }
}
