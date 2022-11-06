package Spring_xml01.com.Joker.Demo.soundsystem;

/**
 * @author Joker
 * @Date 2022/11/5 18:25
 * @Description This is description of class
 * @since version-1.0
 */
public class CompactDisc {
    public CompactDisc(){
        super();
        System.out.println("CompactDisc构造函数......" + this.toString());
    }

    public void paly(){
        System.out.println("播放CD音乐......" + this.toString());
    }
}
