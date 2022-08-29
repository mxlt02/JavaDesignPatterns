package top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public abstract class Mouse {
    Boolean connected = false;

    public abstract String click(String key);

    public void USBProtocol(){
        if (connected){
            connected = false;
            System.out.println("已断开");
        }else {
            connected = true;
            System.out.println("已连接");
        }
    }
}
