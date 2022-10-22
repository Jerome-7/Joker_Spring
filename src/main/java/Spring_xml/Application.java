package Spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Joker
 * @Date 2022/10/12 21:55
 * @Description 主类
 * @since version-1.0
 */


public class Application {

    public static void main(String[] args) {

        // 初始化Application容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从初始化容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // 打印消息
        printer.printMessage();
    }
}
