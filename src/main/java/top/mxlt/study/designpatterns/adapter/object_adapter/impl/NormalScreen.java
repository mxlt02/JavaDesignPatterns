package top.mxlt.study.designpatterns.adapter.object_adapter.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 */
public class NormalScreen {
    public void loadImage(JPGTarget jpgTarget){
        String[][] data = jpgTarget.drawJPG();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j].equals("透明")){
                    throw new IllegalArgumentException("本屏幕不支持透明颜色显示");
                }
            }
        }
        System.out.println("Screen::loadPNGImage\n"+ data);
    }
}
