package Sping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Joker
 * @Date 2022/10/12 21:51
 * @Description 打印机
 * @since version-1.0
 */
// @Component注解将会被@ComponentScan注解所扫描并打印
@Component
public class MessagePrinter {


    public MessagePrinter(){
        super();
        System.out.println("MessagePrinter...");
    }

    private MseeageService service;

    /**
     * @author Joker
     * @Date 2022/10/12 21:53
     * @Description 打印内容
     * @Param []
     * @return void
     * @since version-1.0
     * @throws
     */
    // @Autowired注解将自动调用setService,也会将service和MessagePrinter对象的关联关系重连出来
    @Autowired
    public void setService(MseeageService service){
        this.service = service;
    }
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }

    public MseeageService getMseeageService() {
        return service;
    }

    public void setMseeageService(MseeageService mseeageService) {
        this.service = mseeageService;
    }
}
