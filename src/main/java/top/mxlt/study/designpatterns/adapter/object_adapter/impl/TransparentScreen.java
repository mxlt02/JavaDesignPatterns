package top.mxlt.study.designpatterns.adapter.object_adapter.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 */
public class TransparentScreen {
    public void loadImage(PNGAdaptee pngAdaptee){
        System.out.println("Screen::loadPNGImage\n"+ pngAdaptee.draw());
    }
}
