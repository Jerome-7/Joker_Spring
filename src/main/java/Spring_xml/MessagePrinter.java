package Spring_xml;

/**
 * @author Joker
 * @Date 2022/10/12 21:51
 * @Description 打印机
 * @since version-1.0
 */

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
