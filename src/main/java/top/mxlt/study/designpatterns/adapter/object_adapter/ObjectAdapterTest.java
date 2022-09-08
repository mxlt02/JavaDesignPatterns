package top.mxlt.study.designpatterns.adapter.object_adapter;

import top.mxlt.study.designpatterns.adapter.object_adapter.impl.JPGAdapter;
import top.mxlt.study.designpatterns.adapter.object_adapter.impl.NormalScreen;
import top.mxlt.study.designpatterns.adapter.object_adapter.impl.PNGAdaptee;
import top.mxlt.study.designpatterns.adapter.object_adapter.impl.TransparentScreen;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 * 与class模式的区别是继承关系变成了依赖关系,符合了合成复用原则, 使用组合替代集成
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        //假设你是一个电视厂商, 你们推出了第一个重磅产品透明显示器, 它具有自动显示美丽AI随机画面的功能, 可以显示透明色块
        TransparentScreen transparentScreen = new TransparentScreen();
        transparentScreen.loadImage(new PNGAdaptee());

        //后来你们想推出一款普通显示器来占领下游市场, 它仅仅是使用成本更低的液晶面板, 不能显示透明色
        //可是你们千辛万苦写的AI绘画功能会画出透明的色块, 如果直接传给普通显示器会导致显示异常
        //为了这点小事复制AI重新弄一个排除透明色块的AI太不优雅而且会导致冗余代码过多,很不方便
        //适配器来了, 通过适配器可以自动将AI绘制的画面进行一个处理, 将所有透明色块替换为黑色色块
        NormalScreen normalScreen = new NormalScreen();
        PNGAdaptee pngAdaptee = new PNGAdaptee();
        normalScreen.loadImage(new JPGAdapter(pngAdaptee));
    }
}
