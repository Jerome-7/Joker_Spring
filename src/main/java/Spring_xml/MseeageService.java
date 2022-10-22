package Spring_xml;

/**
 * @author Joker
 * @Date 2022/10/12 21:50
 * @Description 打印服务
 * @since version-1.0
 */
public class MseeageService {

    public MseeageService(){
        super();
        System.out.println("MseeageService...");
    }

    /**
     * @author Joker
     * @Date 2022/10/12 21:50
     * @Description 执行打印功能
     * @return java.lang.String 返回要打印的字符串
     * @since version-1.0
     */
    public String getMessage(){
        return "Hello World";
    }
}
