package Spring_xml01.com.Joker.Demo;

import Spring_xml01.com.Joker.Demo.soundsystem.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Joker
 * @Date 2022/11/5 18:37
 * @Description This is description of class
 * @since version-1.0
 */
public class ApplictionSpring {
    public static void main(String[] args) {
        System.out.println("ApplicationSpring");
        // 调用xml文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取xml文件里bean的class目录
        CompactDisc cd = context.getBean(CompactDisc.class);
        // 调用CompactDisc对象里的paly
        cd.paly();
    }
}
