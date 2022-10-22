package Sping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Joker
 * @Date 2022/10/12 21:55
 * @Description 主类
 * @since version-1.0
 */
// @ComponentScan注解可以将所有@Component注解全部扫描并打印
//@ComponentScan
public class Application {

    public static void main(String[] args) {

        System.out.println("applicationSpring");
//        // 创建打印机对象
//        MessagePrinter printer = new MessagePrinter();
//        // 创建消息服务对象
//        MseeageService service = new MseeageService();
//        // 设置打印机对象属性
//        printer.setMseeageService(service);
//        // 打印消息
//        printer.printMessage();

        // 初始化Application容器
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        // 从初始化容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // 从初始化容器中获取MseeageService对象
        //MseeageService service = context.getBean(MseeageService.class);

//        System.out.println(printer);
//        System.out.println(service);

        // 设置打印机对象属性
        //printer.setMseeageService(service);
        // 打印消息
        printer.printMessage();
    }
}
