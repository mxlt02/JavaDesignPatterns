package top.mxlt.study.designpatterns.factory.impl.abstract_factory.entity;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/8/29
 */
public abstract class Screen {
    Boolean connected = false;

    public abstract String draw(String image);

    public void HDMIProtocol(){
        if (connected){
            connected = false;
            System.out.println("已断开");
        }else {
            connected = true;
            System.out.println("已连接");
        }
    }
}
