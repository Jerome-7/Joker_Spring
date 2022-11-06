package Spring_bean_scope.com.Joker.Dome;

/**
 * @author Joker
 * @Date 2022/11/5 19:49
 * @Description This is description of class
 * @since version-1.0
 */
public class Notepad {

    public Notepad(){
        super();
        System.out.println("Notepad......"+ this.toString());
    }

    public void init(){
        System.out.println("Notepad的初始化方法");
    }

    public void destroy(){
        System.out.println("Notepad的销毁方法");
    }

}
