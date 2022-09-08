package top.mxlt.study.designpatterns.adapter.class_adapter;

import top.mxlt.study.designpatterns.adapter.class_adapter.impl.JPGAdapter;
import top.mxlt.study.designpatterns.adapter.class_adapter.impl.NormalScreen;
import top.mxlt.study.designpatterns.adapter.class_adapter.impl.PNGAdaptee;
import top.mxlt.study.designpatterns.adapter.class_adapter.impl.TransparentScreen;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        //假设你是一个电视厂商, 你们推出了第一个重磅产品透明显示器, 它具有自动显示美丽AI随机画面的功能, 可以显示透明色块
        TransparentScreen transparentScreen = new TransparentScreen();
        transparentScreen.loadImage(new PNGAdaptee());

        //后来你们想推出一款普通显示器来占领下游市场, 它仅仅是使用成本更低的液晶面板, 不能显示透明色
        //可是你们千辛万苦写的AI绘画功能会画出透明的色块, 如果直接传给普通显示器会导致显示异常
        JPGAdapter.enableAdapter = false; //该行命令仅作为演示错误情况使用
        NormalScreen normalScreen = new NormalScreen();
        try{
            normalScreen.loadImage(new JPGAdapter());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //为了这点小事复制AI重新弄一个排除透明色块的AI太不优雅而且会导致冗余代码过多,很不方便
        //适配器来了, 通过适配器可以自动将AI绘制的画面进行一个处理, 将所有透明色块替换为黑色色块
        JPGAdapter.enableAdapter = true; //该行命令仅作为演示错误情况使用
        normalScreen.loadImage(new JPGAdapter());
    }
}
