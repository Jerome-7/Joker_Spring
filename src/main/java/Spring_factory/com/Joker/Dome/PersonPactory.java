package Spring_factory.com.Joker.Dome;

/**
 * @author Joker
 * @Date 2022/11/5 21:05
 * @Description This is description of class
 * @since version-1.0
 */
public class PersonPactory {

    public static Person createPersonl(){
        System.out.println("静态工厂创建Person......");
        return new Person();
    }

    public Person createPerson2(){
        System.out.println("实例工厂创建Person");
        return new Person();
    }
}
