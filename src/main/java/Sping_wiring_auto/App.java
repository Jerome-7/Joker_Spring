package Sping_wiring_auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Joker
 * @Date 2022/10/19 21:18
 * @Description 主类
 * @since version-1.0
 */
// @ComponentScan注解可以将所有@Component注解全部扫描并打印
//@ComponentScan
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CDplayer player = context.getBean(CDplayer.class);
        player.play();
    }
}
