package Spring_bean_scope.com.Joker.Dome;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Joker
 * @Date 2022/11/5 19:49
 * @Description This is description of class
 * @since version-1.0
 */
@Component
@Scope("Sinleton")
// @Scope(scopeName = "prototype")
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// 延迟加载
@Lazy
public class Notepad2 {

    public Notepad2(){
        super();
        System.out.println("Notepad2的构造函数......"+ this.toString());
    }
    public void init(){
        System.out.println("Notepad2的初始化方法");
    }

    public void destroy(){
        System.out.println("Notepad2的销毁方法");
    }

}
