package top.mxlt.study.designpatterns.adapter.object_adapter.impl;

/**
 * @author AlanZhao
 * @email a@mxlt.top
 * @date 2022/9/8
 */
public class JPGAdapter implements JPGTarget {

    public static Boolean enableAdapter = true;

    private PNGAdaptee pngAdaptee;

    public JPGAdapter(PNGAdaptee pngAdaptee) {
        this.pngAdaptee = pngAdaptee;
    }

    @Override
    public String[][] drawJPG() {
        String[][] data = pngAdaptee.draw();
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
