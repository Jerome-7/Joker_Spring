package Spring_bean_scope.com.Joker.Dome;

/**
 * @author Joker
 * @Date 2022/11/5 19:49
 * @Description This is description of class
 * @since version-1.0
 */
public class Notepad3 {

    public Notepad3(){
        super();
        System.out.println("Notepad3的构造函数......"+ this.toString());
    }
    public void init(){
        System.out.println("Notepad3的初始化方法");
    }

    public void destroy(){
        System.out.println("Notepad3的销毁方法");
    }

}
