package top.mxlt.study.designpatterns.adapter.class_adapter.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 */
public class JPGAdapter extends PNGAdaptee implements JPGTarget{

    public static Boolean enableAdapter = true;

    @Override
    public String[][] drawJPG() {
        String[][] data = super.draw();
        if (enableAdapter){
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (data[i][j].equals("透明")){
                        data[i][j] = "黑色";
                    }
                }
            }
        }
        return data;
    }
}
